package aivlebigprojectvhjms.infra;

import aivlebigprojectvhjms.config.kafka.KafkaProcessor;
import aivlebigprojectvhjms.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private CustomerInfoRepository customerInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCustomerRegistered_then_CREATE_1(
        @Payload CustomerRegistered customerRegistered
    ) {
        try {
            if (!customerRegistered.validate()) return;
            System.out.println("📩 [ServiceContext] 이벤트 수신: userId = " + customerRegistered.getUserId());
            // view 객체 생성
            CustomerInfo customerInfo = new CustomerInfo();
            // view 객체에 이벤트의 Value 를 set 함
            customerInfo.setAge(customerRegistered.getAge());
            customerInfo.setDisease(customerRegistered.getDiseaseList());
            customerInfo.setHasChildern(customerRegistered.getHasChildren());
            customerInfo.setGender(
                String.valueOf(customerRegistered.getGender())
            );
            customerInfo.setIsMarriage(
                Boolean.valueOf(customerRegistered.getIsMarried())
            );
            customerInfo.setId(Long.valueOf(customerRegistered.getUserId()));
            // view 레파지 토리에 save
            customerInfoRepository.save(customerInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
