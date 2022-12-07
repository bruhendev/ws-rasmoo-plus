package com.client.ws.rasmooplus.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {

    private Long id;

    @NotBlank(message = "não pode ser nulo ou vazio")
    @Size(min = 5, max = 30)
    private String name;

    @Max(value = 12, message = "não poder ser maior que 12")
    private Long accessMonths;

    @NotNull(message = "não pode ser nulo")
    private BigDecimal price;

    @NotBlank(message = "não pode ser nulo ou vazio")
    @Size(min = 5, max = 15, message = "deve ter tamanho entre 5 e 15")
    private String productKey;
}
