package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CustomerRegistered extends AbstractEvent {

    private Long customerId;
    private Long userId;
    private String phone;
    private List<String> diseaseList;
    private Integer age;
    private String job;
    private String address;
    private String gender;
    private Boolean hasChildren;
    private Boolean isMarried;
    private Date birthDate;
}
