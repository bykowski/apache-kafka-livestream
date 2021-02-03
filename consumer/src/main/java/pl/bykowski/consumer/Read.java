package pl.bykowski.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Read {

    @KafkaListener(topics = "horror")
    public void main(String message) {
        System.out.println(message);
    }
}
