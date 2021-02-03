package pl.bykowski.consumer2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Read {

    @KafkaListener(topics = "sf")
    public void main(String message) {
        System.out.println(message);
    }
}
