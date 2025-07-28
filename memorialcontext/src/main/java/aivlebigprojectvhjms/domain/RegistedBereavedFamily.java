package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RegistedBereavedFamily extends AbstractEvent {

    private Long id;
    private String memorialId;
    private String userId;
    private String name;
    private String relationship;

    public RegistedBereavedFamily(FamilyMember aggregate) {
        super(aggregate);
    }

    public RegistedBereavedFamily() {
        super();
    }
}
//>>> DDD / Domain Event
