package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeletedUser extends AbstractEvent {

    private Long id;
    private String loginId;
    private String loginPassword;
    private String name;
    private Email email;
    private String role;

    public DeletedUser(User aggregate) {
        super(aggregate);
    }

    public DeletedUser() {
        super();
    }
}
//>>> DDD / Domain Event
