package com.sda.construction.rest;

import com.sda.construction.dto.CimentDTO;
import com.sda.construction.service.CimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/addCiment", consumes = "application/json")
    public ResponseEntity addCiment(@RequestBody CimentDTO cimentDTO) {
        cimentService.saveCiment(cimentDTO);
        return ResponseEntity.ok().build();
    }
}
