package fooddeliveryz.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddeliveryz.config.kafka.KafkaProcessor;
import fooddeliveryz.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FoodPicked'"
    )
    public void wheneverFoodPicked_UpdateSatus(@Payload FoodPicked foodPicked) {
        FoodPicked event = foodPicked;
        System.out.println(
            "\n\n##### listener UpdateSatus : " + foodPicked + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryConfirm'"
    )
    public void wheneverDeliveryConfirm_UpdateSatus(
        @Payload DeliveryConfirm deliveryConfirm
    ) {
        DeliveryConfirm event = deliveryConfirm;
        System.out.println(
            "\n\n##### listener UpdateSatus : " + deliveryConfirm + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Cookstarted'"
    )
    public void wheneverCookstarted_UpdateSatus(
        @Payload Cookstarted cookstarted
    ) {
        Cookstarted event = cookstarted;
        System.out.println(
            "\n\n##### listener UpdateSatus : " + cookstarted + "\n\n"
        );
        // Sample Logic //

    }
}
