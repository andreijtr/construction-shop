package com.sda.construction.rest;

import com.sda.construction.dto.GrindaDTO;
import com.sda.construction.service.GrindaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grinda")
public class GrindaController {

    @Autowired
    private GrindaService grindaService;

    @GetMapping("/allGrinzi")
    public List<GrindaDTO> getAllGrinzi() {
        return grindaService.findAll();
    }

    @GetMapping("/lemn")
    public List<GrindaDTO> getGrinziByLemn(@RequestParam(name = "tip") String tip) {
        return grindaService.findByLemn(tip);
    }
}
