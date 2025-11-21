package com.idgs12.horario.horario.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.idgs12.horario.horario.dto.MateriaDTO;

@FeignClient(name = "materias", url = "http://materias:8083")
public interface MateriaFeignClient {

    @GetMapping("/materias/{id}")
    MateriaDTO getMateriaById(@PathVariable("id") Integer id);
}
