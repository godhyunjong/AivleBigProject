package aivlebigprojectvhjms.llm;

import java.util.List;
import java.util.Map;

public class GptClient {
    public static String callChatGpt(List<Map<String, String>> messages) {
        return "추천 서비스1: 여행서비스\n추천 서비스2: 세라잼 홈헬스케어\n메시지: 고객님께 꼭 맞는 상품을 추천드립니다!";
    }

    public static ParsedResult parse(String gptResponse) {
        return new ParsedResult("여행서비스", "세라잼 홈헬스케어", "고객님께 꼭 맞는 상품을 추천드립니다!");
    }
}