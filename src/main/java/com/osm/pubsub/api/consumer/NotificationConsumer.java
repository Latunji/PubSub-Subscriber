package com.osm.pubsub.api.consumer;

import com.osm.pubsub.api.config.MessagingConfig;
import com.osm.pubsub.api.domain.Topic;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void ConsumeMessageFromQueue(Topic t){
        System.out.println("payload : "+t);
    }
}
