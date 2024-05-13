package com.gabbriellps.resttemplate.api.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VeiculoResponseDTO {

    @JsonProperty(value = "_id")
    private String id;
    private String nome;
    private String modelo;
    private String marca;
    private String cor;
    private String ano;

}
