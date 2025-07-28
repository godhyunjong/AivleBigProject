package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.domain.*;
import aivlebigprojectvhjms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class UpdatedCustomer extends AbstractEvent {

    private Long customerId;
    private Long userId;
    private String phone;
    private Integer age;
    private String job;
    private String address;
    private String gender;
    private Boolean hasChildren;
    private Boolean isMarried;
    private List<String> diseaseList;

    public UpdatedCustomer(CustomerProfile aggregate) {
        super(aggregate);
    }

    public UpdatedCustomer() {
        super();
    }
}
//>>> DDD / Domain Event
