package aivlebigprojectvhjms.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;
import java.time.LocalDate;


//<<< EDA / CQRS
@Entity
@Table(name="CustomerInfo_table")
@Data
public class CustomerInfo {

    @Id
    private Long id;
    private Integer age;

    @ElementCollection
    private List<String> disease;
    private Boolean hasChildren;
    private String gender;
    private Boolean isMarriage;
}
