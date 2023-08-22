package io.j3ffn.jsonconsumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter

public class Payment implements Serializable {

    private Long id;

    private Long idUser;

    private Long idProduct;

    private String cardNumber;



}
