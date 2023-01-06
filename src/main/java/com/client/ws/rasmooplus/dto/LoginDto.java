package com.client.ws.rasmooplus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    @NotBlank(message = "atributo obrigatório")
    private String username;
    @NotBlank(message = "atributo obrigatório")
    private String password;
}
