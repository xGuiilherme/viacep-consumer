package com.example.WebAPI.client;

import com.example.WebAPI.model.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cepService", url = "https://viacep.com.br")
public interface CepClient {

    @RequestMapping(method = RequestMethod.GET, value = "/ws/{cep}/json")
    CepResponse getCep(@PathVariable("cep") String cep);
}
