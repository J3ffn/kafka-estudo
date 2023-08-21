package io.j3ffn.srcconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SrcConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrcConsumerApplication.class, args);
	}

}
