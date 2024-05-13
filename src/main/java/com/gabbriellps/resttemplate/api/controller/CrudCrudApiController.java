package com.gabbriellps.resttemplate.api.controller;

import com.gabbriellps.resttemplate.api.dto.VeiculoDTO;
import com.gabbriellps.resttemplate.api.service.interfaces.CrudCrudApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CrudCrudApiController {

    private final CrudCrudApiService crudCrudApiService;

    public CrudCrudApiController(CrudCrudApiService crudCrudApiService) {
        this.crudCrudApiService = crudCrudApiService;
    }


    @PostMapping("/veiculos")
    public ResponseEntity<?> insereVeiculo(@RequestBody VeiculoDTO requestDTO){
        crudCrudApiService.insereVeiculo(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
