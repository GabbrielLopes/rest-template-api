package com.gabbriellps.resttemplate.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VeiculoDTO {

    private String nome;
    private String modelo;
    private String marca;
    private String cor;
    private String ano;

}
