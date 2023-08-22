package io.j3ffn.paymentservice.services.impl;

import io.j3ffn.paymentservice.model.Payment;
import io.j3ffn.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Log4j2
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
       log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
       Thread.sleep(1000);

       log.info("Enviando pagamento...");
        kafkaTemplate.send("payment-topic", payment);
    }
}
