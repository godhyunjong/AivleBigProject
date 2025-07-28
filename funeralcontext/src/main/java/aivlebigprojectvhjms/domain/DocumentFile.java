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
@Table(name = "DocumentFile_table")
@Data
//<<< DDD / Aggregate Root
public class DocumentFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long documentid;

    public static DocumentFileRepository repository() {
        DocumentFileRepository documentFileRepository = FuneralcontextApplication.applicationContext.getBean(
            DocumentFileRepository.class
        );
        return documentFileRepository;
    }
}
//>>> DDD / Aggregate Root
