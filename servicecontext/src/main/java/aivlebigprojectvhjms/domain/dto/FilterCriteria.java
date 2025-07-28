package aivlebigprojectvhjms.domain.dto;

import lombok.Data;

@Data
public class FilterCriteria {
    private Boolean isMarried;
    private Boolean hasChildren;
    private Boolean diseaseFree;

    private String gender;       // 예: "남성", "여성"
    private String ageGroup;     // 예: "40대", "50대"
    private String disease;      // 예: "없음", "고혈압"
    private String family;       // 예: "기혼", "미혼", "자녀 있음"


    public Boolean getIsMarried() {
        return isMarried;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public Boolean getDiseaseFree() {
        return diseaseFree;
    }

    public String getGender() {
        return gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getDisease() {
        return disease;
    }

    public String getFamily() {
        return family;
    }
}