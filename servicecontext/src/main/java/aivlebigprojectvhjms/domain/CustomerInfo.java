package aivlebigprojectvhjms.domain;

import javax.persistence.*;
import java.util.List;

import lombok.Data;


//<<< EDA / CQRS
@Entity
@Table(name="CustomerInfo_table")
@Data
public class CustomerInfo {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Integer age;
        private Boolean hasChildern;
        private String gender;
        private Boolean isMarriage;

        @Convert(converter = StringListConverter.class)
        private List<String> disease;
}
