package com.client.ws.rasmooplus.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPaymentInfoDto {

    private Long id;

    @Size(max = 16, min = 16, message = "deve conter 16 caracteres")
    private String cardNumber;

    @Min(value = 1)
    @Max(value = 12)
    private Long cardExpirationMonth;

    private Long cardExpirationYear;

    @Size(max = 3, min = 3, message = "deve conter 3 caracteres")
    private String cardSecurityCode;

    private BigDecimal price;

    private LocalDate dtPayment = LocalDate.now();

    private Long installments;

    @NotNull(message = "deve ser informado")
    private Long userId;

}
