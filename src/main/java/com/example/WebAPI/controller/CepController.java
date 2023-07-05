package com.example.WebAPI.controller;

import com.example.WebAPI.client.CepClient;
import com.example.WebAPI.model.CepResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/ceps")
public class CepController {

    private final CepClient cepClient;

    @RequestMapping(value = "/{cep}")
    public ResponseEntity<CepResponse> getCep(@PathVariable String cep) {
        CepResponse cepResponse = cepClient.getCep(cep);
        return ResponseEntity.ok(cepResponse);
    }
}
