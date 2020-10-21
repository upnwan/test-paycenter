package nosmokeadd;

import nosmokeadd.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class PayListViewHandler {


    @Autowired
    private PayListRepository payListRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPointPaid_then_CREATE_1 (@Payload PointPaid pointPaid) {
        try {
            if (pointPaid.isMe()) {
                // view 객체 생성
                PayList payList = new PayList();
                // view 객체에 이벤트의 Value 를 set 함
                payList.setPayId(pointPaid.getId());
                payList.setPoint(pointPaid.getPoint());
                // view 레파지 토리에 save
                payListRepository.save(payList);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenPointPaid_then_UPDATE_1(@Payload PointPaid pointPaid) {
        try {
            if (pointPaid.isMe()) {
                // view 객체 조회
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}