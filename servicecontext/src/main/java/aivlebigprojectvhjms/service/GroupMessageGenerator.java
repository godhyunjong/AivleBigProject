package aivlebigprojectvhjms.service;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.domain.dto.FilterCriteria;
import aivlebigprojectvhjms.llm.GptClient;
import aivlebigprojectvhjms.llm.ParsedResult;
import aivlebigprojectvhjms.llm.PromptBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class GroupMessageGenerator {

    @Autowired
    CustomerFilteringService filteringService;

    @Autowired
    RecommendMessageRepository repository;

    @Autowired
    ConversionServiceRepository conversionServiceRepository;  // ✅ 여기 추가!

    public int generate(FilterCriteria criteria) throws Exception {
        List<CustomerInfo> group = filteringService.filterCustomers(criteria);
        if (group.isEmpty()) return 0;

        List<Map<String, String>> messages = PromptBuilder.asChatMessage(criteria);
        String gptResponse = GptClient.callChatGpt(messages);
        ParsedResult parsed = GptClient.parse(gptResponse);

        for (CustomerInfo c : group) {
            RecommendMessage msg = new RecommendMessage();
            msg.setCustomerId(c.getId());
            msg.setComment(parsed.getMessage());
            msg.setServiceId1(findServiceIdByName(parsed.getService1()));  // ✅ 여기 메서드 아래 정의됨
            msg.setServiceId2(findServiceIdByName(parsed.getService2()));
            msg.setCreateMessageDate(new Date());
            repository.save(msg);
        }

        return group.size();
    }

    // ✅ 여기서 serviceName으로 serviceId 찾아주는 로직 정의
    private Long findServiceIdByName(String serviceName) {
        return conversionServiceRepository.findByServiceName(serviceName)
            .map(ConversionService::getServiceId)
            .orElseThrow(() -> new IllegalArgumentException("서비스 이름에 해당하는 전환 서비스가 없습니다: " + serviceName));
    }
}