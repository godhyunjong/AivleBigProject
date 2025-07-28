package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.domain.dto.FilterCriteria; // ✅ 이 줄 추가!
import aivlebigprojectvhjms.service.GroupMessageGenerator; // ✅ 필요 시 같이 추가
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/generate-group-message")
public class RecommendMessageController {

    @Autowired
    GroupMessageGenerator generator;

    @PostMapping
    public ResponseEntity<?> generateGroup(@RequestBody FilterCriteria criteria) {
        try {
            int created = generator.generate(criteria);
            return ResponseEntity.ok(Map.of(
                "count", created,
                "status", created + "명의 고객에게 동일한 추천 메시지가 저장되었습니다."
            ));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }
}