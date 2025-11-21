package com.idgs12.horario.horario.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.idgs12.horario.horario.dto.GrupoDTO;

@FeignClient(name = "grupos", url = "http://grupos:8086")
public interface GrupoFeignClient {

    @GetMapping("/grupos/{id}")
    GrupoDTO getGrupoById(@PathVariable("id") Integer id);
}
