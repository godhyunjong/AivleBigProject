package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.MemorialcontextApplication;
import aivlebigprojectvhjms.domain.RegistedBereavedFamily;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FamilyMember_table")
@Data
//<<< DDD / Aggregate Root
public class FamilyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long familyMemberId;

    private String memorialId;

    private String userId;

    private String name;

    private String relationship;

    @PostPersist
    public void onPostPersist() {
        RegistedBereavedFamily registedBereavedFamily = new RegistedBereavedFamily(
            this
        );
        registedBereavedFamily.publishAfterCommit();
    }

    public static FamilyMemberRepository repository() {
        FamilyMemberRepository familyMemberRepository = MemorialcontextApplication.applicationContext.getBean(
            FamilyMemberRepository.class
        );
        return familyMemberRepository;
    }
}
//>>> DDD / Aggregate Root
