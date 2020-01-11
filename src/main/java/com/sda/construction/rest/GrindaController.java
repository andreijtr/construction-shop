package com.sda.construction.rest;

import com.sda.construction.dto.GrindaDTO;
import com.sda.construction.service.GrindaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/addGrinda", consumes = "application/json")
    public ResponseEntity addGrinda(@RequestBody GrindaDTO grindaDTO) {
        grindaService.saveGrinda(grindaDTO);
        ResponseEntity responseEntity = ResponseEntity.status(HttpStatus.OK).build();
        return responseEntity;
    }

    @GetMapping(path = "find-by-parameters", consumes = "application/json")
    public ResponseEntity<List<GrindaDTO>> findByParameters(@RequestBody GrindaDTO grindaDTO) {
        List<GrindaDTO> grindaDTOList = grindaService.findByParameters(grindaDTO);
        return new ResponseEntity<>(grindaDTOList, HttpStatus.OK);
    }
}
