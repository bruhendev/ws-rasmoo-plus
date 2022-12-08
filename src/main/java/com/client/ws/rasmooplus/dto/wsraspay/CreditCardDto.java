package com.client.ws.rasmooplus.dto.wsraspay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardDto {
    
    private Long cvv;

    private String documentNumber;

    private Long installments;

    private String number;

    private String month;

    private String year;
}
