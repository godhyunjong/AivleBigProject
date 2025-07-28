package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.UsercontextApplication;
import aivlebigprojectvhjms.domain.DeletedUser;
import aivlebigprojectvhjms.domain.UserUpdated;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_table")
@Data
//<<< DDD / Aggregate Root
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String loginId;

    private String loginPassword;

    private String name;

    @Embedded
    // private Email email;

    private String role;

    @PostPersist
    public void onPostPersist() {
        DeletedUser deletedUser = new DeletedUser(this);
        deletedUser.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {
        UserUpdated userUpdated = new UserUpdated(this);
        userUpdated.publishAfterCommit();
    }

    public static UserRepository repository() {
        UserRepository userRepository = UsercontextApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
//>>> DDD / Aggregate Root
