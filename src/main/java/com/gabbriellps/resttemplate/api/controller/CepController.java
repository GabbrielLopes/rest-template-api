package com.gabbriellps.resttemplate.api.controller;

import com.gabbriellps.resttemplate.api.dto.response.CepBrasilApiResponseDTO;
import com.gabbriellps.resttemplate.api.dto.response.ViaCepResponseDTO;
import com.gabbriellps.resttemplate.api.service.interfaces.CepService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CepController {

    private final CepService cepService;

    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/v1/cep/{cep}")
    public ResponseEntity<ViaCepResponseDTO> buscaCepPelaViaCep(@PathVariable("cep") String cep){
        return ResponseEntity.status(HttpStatus.OK).body(cepService.buscaViaCep(cep));
    }

    @GetMapping("/v2/cep/{cep}")
    public ResponseEntity<CepBrasilApiResponseDTO> buscaCepPelaBrasilApi(@PathVariable("cep") String cep){
        return ResponseEntity.status(HttpStatus.OK).body(cepService.buscaBrasilApi(cep));
    }


}
