package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class UpdatedMessage extends AbstractEvent {

    private Long messageId;
    private String comment;
    private Long serviceId1;
    private Long serviceId2;
    private Long customerId;
    private Date createMessageDate;

    public UpdatedMessage(RecommendMessage aggregate) {
        super(aggregate);
    }

    public UpdatedMessage() {
        super();
    }
}
//>>> DDD / Domain Event
