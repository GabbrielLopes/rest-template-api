package com.gabbriellps.resttemplate.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CepBrasilApiResponseDTO {

    private String city;
    private String street;
    private String service;
    private String state;
    private String neighborhood;
    private String cep;

}
