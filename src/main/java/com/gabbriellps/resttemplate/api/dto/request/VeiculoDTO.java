package com.gabbriellps.resttemplate.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

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
