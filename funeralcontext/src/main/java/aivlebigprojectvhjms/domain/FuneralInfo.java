package aivlebigprojectvhjms.domain;

import aivlebigprojectvhjms.FuneralcontextApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FuneralInfo_table")
@Data
//<<< DDD / Aggregate Root
public class FuneralInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameHangeul;

    private String nameHanja;

    private String rrn;

    private String gender;

    private String religion;

    private String relationToHouseholdHead;

    private Date reportRegistrationDate;

    private String reportUserId;

    private String reporterName;

    private String reporterRrn;

    private String reporterRelationToDeceased;

    private String reporterAddress;

    private String reporterPhone;

    private String reporterEmail;

    private String submitterName;

    private String submitterRrn;

    private String funeralCompanyName;

    private String directorName;

    private String directorPhone;

    private String funeralHomeName;

    private String mortuaryInfo;

    private String funeralHomeAddress;

    private String funeralDuration;

    private Date processionDateTime;

    private String burialSiteInfo;

    @ElementCollection
    private List<String> chiefMourners;

    private String templateKeyword;

    public static FuneralInfoRepository repository() {
        FuneralInfoRepository funeralInfoRepository = FuneralcontextApplication.applicationContext.getBean(
            FuneralInfoRepository.class
        );
        return funeralInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public void resistFuneralInfo() {
        //implement business logic here:

        ResistedFuneralInfo resistedFuneralInfo = new ResistedFuneralInfo(this);
        resistedFuneralInfo.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
