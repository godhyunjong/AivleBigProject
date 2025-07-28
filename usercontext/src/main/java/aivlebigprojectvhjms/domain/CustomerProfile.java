package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.UsercontextApplication;
import aivlebigprojectvhjms.domain.CustomerRegistered;
import aivlebigprojectvhjms.domain.UpdatedCustomer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CustomerProfile_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private Long userId;

    private String phone;

    private Integer age;

    private String job;

    private String address;

    private String gender;

    private Boolean hasChildren;

    private Boolean isMarried;

    @ElementCollection
    private List<String> diseaseList;

    @PostPersist
    public void onPostPersist() {
        CustomerRegistered customerRegistered = new CustomerRegistered(this);
        customerRegistered.publishAfterCommit();

        UpdatedCustomer updatedCustomer = new UpdatedCustomer(this);
        updatedCustomer.publishAfterCommit();
    }

    public static CustomerProfileRepository repository() {
        CustomerProfileRepository customerProfileRepository = UsercontextApplication.applicationContext.getBean(
            CustomerProfileRepository.class
        );
        return customerProfileRepository;
    }
}
//>>> DDD / Aggregate Root
