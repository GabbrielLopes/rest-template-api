package com.gabbriellps.resttemplate.api.controller;

import com.gabbriellps.resttemplate.api.dto.request.VeiculoRequestDTO;
import com.gabbriellps.resttemplate.api.dto.response.VeiculoResponseDTO;
import com.gabbriellps.resttemplate.api.service.interfaces.CrudCrudApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class VeiculoCrudApiController {

    private final CrudCrudApiService crudCrudApiService;

    public VeiculoCrudApiController(CrudCrudApiService crudCrudApiService) {
        this.crudCrudApiService = crudCrudApiService;
    }


    @GetMapping("/veiculos")
    public ResponseEntity<List<VeiculoResponseDTO>> buscaVeiculos(){
        return ResponseEntity.status(HttpStatus.OK).body(crudCrudApiService.buscaVeiculos());
    }

    @GetMapping("/veiculos/{id}")
    public ResponseEntity<VeiculoResponseDTO> buscaVeiculo(@PathVariable("id") String id){
        return ResponseEntity.status(HttpStatus.OK).body(crudCrudApiService.buscaVeiculo(id));
    }

    @PostMapping("/veiculos")
    public ResponseEntity<?> insereVeiculo(@RequestBody VeiculoRequestDTO requestDTO){
        crudCrudApiService.insereVeiculo(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/veiculos/{id}")
    public ResponseEntity<?> editaVeiculo(@PathVariable("id") String id,
                                           @RequestBody VeiculoRequestDTO requestDTO){
        crudCrudApiService.editaVeiculo(id, requestDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/veiculos/{id}")
    public ResponseEntity<?> deletaVeiculo(@PathVariable("id") String id){
        crudCrudApiService.deletaVeiculo(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
