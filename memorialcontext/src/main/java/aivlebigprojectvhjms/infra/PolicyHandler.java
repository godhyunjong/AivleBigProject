package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.config.kafka.KafkaProcessor;
import aivlebigprojectvhjms.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MemorialRepository memorialRepository;

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    PhotoRepository photoRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    FamilyMemberRepository familyMemberRepository;

    @Autowired
    TributeRepository tributeRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ResistedFuneralInfo'"
    )
    public void wheneverResistedFuneralInfo_SaveMemorial(
        @Payload ResistedFuneralInfo resistedFuneralInfo
    ) {
        ResistedFuneralInfo event = resistedFuneralInfo;
        System.out.println(
            "\n\n##### listener SaveMemorial : " + resistedFuneralInfo + "\n\n"
        );

        // Sample Logic //
        Memorial.saveMemorial(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
