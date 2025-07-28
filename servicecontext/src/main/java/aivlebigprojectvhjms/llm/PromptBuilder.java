package aivlebigprojectvhjms.llm;

import java.util.List;
import java.util.Map;
import aivlebigprojectvhjms.domain.dto.FilterCriteria;

public class PromptBuilder {

    private static final String SYSTEM_PROMPT =
        "당신은 고객 정보에 기반해 적절한 전환 서비스를 추천하는 마케팅 전문가입니다. 고객 조건에 따라 가장 알맞은 전환 서비스 2가지를 선정하고, 따뜻하고 정중한 말투로 상품을 추천드린 이유와 권유하는 마케팅 메시지를 5줄 이내로 작성해주세요.\n" +
        "\n" +
        "주의 사항:\n" +
        "- 반드시 아래 제공된 서비스 목록 중에서만 골라 추천하세요.\n" +
        "- 목록에 없는 서비스를 임의로 만들거나 변경해서는 절대 안 됩니다.\n" +
        "- 서비스명은 아래 목록에서 정확히 복사해서 사용하세요.\n" +
        "- 출력은 반드시 한국어로만 작성하세요. 한국어 이외의 언어는 사용하지 마세요.\n" +
        "- 아래 형식에 맞춰 정확히 출력하세요.\n" +
        "\n" +
        "[사용 가능한 전환서비스 목록]\n" +
        "- 결혼정보 서비스\n" +
        "- 프리미엄 골프용품 서비스\n" +
        "- 프리하이모 가발 패키지 서비스\n" +
        "- 여행서비스\n" +
        "- 웨딩서비스\n" +
        "- 골프패키지\n" +
        "- 돌잔치 서비스\n" +
        "- 어학연수 서비스\n" +
        "- 수연 서비스\n" +
        "- 현대 리바트 홈 인테리어 서비스\n" +
        "- 세라잼 홈헬스케어서비스\n" +
        "- 장지 서비스";

    public static List<Map<String, String>> asChatMessage(FilterCriteria c) {
        String userPrompt = String.format(
            "고객 군집 조건:\n" +
            "- 나이대: %s\n" +
            "- 성별: %s\n" +
            "- 질병 유무: %s\n" +
            "- 가족 구성: %s\n" +
            "\n" +
            "아래 형식을 따라 추천 결과를 작성해주세요:\n" +
            "\n" +
            "[추천된 전환서비스]\n" +
            "- [서비스명1]\n" +
            "- [서비스명2]\n" +
            "\n" +
            "[메시지 내용]\n" +
            "[OO상조] [위 조건을 가진 고객에게 적합한 따뜻한 마케팅 메시지 작성]\n" +
            "\n" +
            "[상품 자세히 보기]",
            c.getAgeGroup(), c.getGender(), c.getDisease(), c.getFamily()
        );

        return List.of(
            Map.of("role", "system", "content", SYSTEM_PROMPT),
            Map.of("role", "user", "content", userPrompt)
        );
    }
}