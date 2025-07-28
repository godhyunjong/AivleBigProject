package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ResistedFuneralInfo extends AbstractEvent {

    private Long id;
    private String nameHangeul;
    private String gender;
    private String funeralCompanyName;
    private String directorName;
    private String directorPhone;
    private String funeralHomeName;
    private String mortuaryInfo;
    private String funeralHomeAddress;
    private String funeralDuration;
    private Date processionDateTime;
    private String burialSiteInfo;
    private Object chiefMourners;
    private String templateKeyword;
}
