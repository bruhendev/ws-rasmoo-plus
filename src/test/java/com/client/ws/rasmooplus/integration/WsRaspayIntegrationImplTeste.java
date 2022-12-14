package com.client.ws.rasmooplus.integration;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.client.ws.rasmooplus.dto.wsraspay.CreditCardDto;
import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;

@SpringBootTest
public class WsRaspayIntegrationImplTeste {
    
    @Autowired
    private WsRaspayIntegration wsRaspayIntegration;

    // @Test
    // void createCustomerWhenDtoOk() {
    //     CustomerDto dto = new CustomerDto(null, "860.263.270-37", "email@email.br", "João", "Pereira");
    //     wsRaspayIntegration.createCustomer(dto);
    // }

    // @Test
    // void createOrderWhenDtoOk() {
    //     OrderDto dto = new OrderDto(null, "6398c2922f44f417d47e7d8e", BigDecimal.ZERO, "MONTH22");
    //     wsRaspayIntegration.createOrder(dto);
    // }

    // @Test
    // void processPaymentWhenDtoOk() {
    //     CreditCardDto creditCardDto = new CreditCardDto(123L, "860.263.270-37", 0L, 06L, "1234123412341234", 2022L);
    //     PaymentDto paymentDto = new PaymentDto(creditCardDto, "6398c2922f44f417d47e7d8e", "6398cd8b2f44f417d47e7d92");
    //     wsRaspayIntegration.processPayment(paymentDto);
    // }
}
