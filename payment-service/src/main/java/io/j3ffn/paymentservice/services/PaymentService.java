package io.j3ffn.paymentservice.services;

import io.j3ffn.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);

}
