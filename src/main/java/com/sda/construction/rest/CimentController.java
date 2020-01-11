package com.sda.construction.rest;

import com.sda.construction.dto.CimentDTO;
import com.sda.construction.service.CimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciment")
public class CimentController {

    @Autowired
    private CimentService cimentService;

    @GetMapping("/getByProducator")
    public List<CimentDTO> findByProducator(@RequestParam String producator) {
        return cimentService.findByProducator(producator);
    }
}
