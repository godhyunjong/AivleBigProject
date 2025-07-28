package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
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
    private List<String> chiefMourners;
    private String templateKeyword;

    public ResistedFuneralInfo(FuneralInfo aggregate) {
        super(aggregate);
    }

    public ResistedFuneralInfo() {
        super();
    }
}
//>>> DDD / Domain Event
