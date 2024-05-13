package com.gabbriellps.resttemplate.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ViaCepResponseDTO {

    private String cep;
    private String uf;
    private String complemento;
    private String ddd;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String ibge;
    private String siafi;
    private String gia;

}
