package com.client.ws.rasmooplus.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;

@SpringBootTest
public class WsRaspayIntegrationImplTeste {
    
    @Autowired
    private WsRaspayIntegration wsRaspayIntegration;

    @Test
    void createCustomerWhenDtoOk() {
        CustomerDto dto = new CustomerDto(null, "860.263.270-37", "email@email.br", "João", "Pereira");
        wsRaspayIntegration.createCustomer(dto);
    }
}
