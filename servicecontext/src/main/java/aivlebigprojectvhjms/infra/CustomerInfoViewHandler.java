package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.config.kafka.KafkaProcessor;
import aivlebigprojectvhjms.domain.*;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoViewHandler {

    @Autowired
    private CustomerInfoRepository customerInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCustomerRegistered_then_CREATE_1(
        @Payload CustomerRegistered customerRegistered
    ) {
        try {
            if (!customerRegistered.validate()) return;

            // view 객체 생성
            CustomerInfo customerInfo = new CustomerInfo();

            // view 객체에 이벤트의 Value 를 set 함
            customerInfo.setId(Long.valueOf(customerRegistered.getUserId()));
            customerInfo.setAge(customerRegistered.getAge());
            customerInfo.setDisease(customerRegistered.getDiseaseList()); 
            customerInfo.setHasChildren(customerRegistered.getHasChildren()); 
            customerInfo.setGender(customerRegistered.getGender());
            customerInfo.setIsMarriage(customerRegistered.getIsMarried());

            // view 레파지토리에 save
            customerInfoRepository.save(customerInfo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}