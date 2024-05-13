package com.gabbriellps.resttemplate.api.controller;

import com.gabbriellps.resttemplate.api.dto.request.VeiculoDTO;
import com.gabbriellps.resttemplate.api.service.interfaces.CrudCrudApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CrudCrudApiController {

    private final CrudCrudApiService crudCrudApiService;

    public CrudCrudApiController(CrudCrudApiService crudCrudApiService) {
        this.crudCrudApiService = crudCrudApiService;
    }


    @GetMapping("/veiculos")
    public ResponseEntity<List<VeiculoDTO>> buscaVeiculos(){
        return ResponseEntity.status(HttpStatus.OK).body(crudCrudApiService.buscaVeiculos());
    }

    @PostMapping("/veiculos")
    public ResponseEntity<?> insereVeiculo(@RequestBody VeiculoDTO requestDTO){
        crudCrudApiService.insereVeiculo(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
