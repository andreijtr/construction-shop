package com.sda.construction.rest;

import com.sda.construction.dto.CaramidaDTO;
import com.sda.construction.service.CaramidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/caramida")
public class CaramidaController {

    @Autowired
    private CaramidaService caramidaService;

    @GetMapping(value = "/afiseazaCaramizi")
    public List<CaramidaDTO> afiseazaCaramizi() {
        List<CaramidaDTO> caramiziDTO = caramidaService.getAllCaramizi();
        return caramiziDTO;
    }

    @DeleteMapping(path = "/deleteByQuantity/{quantity}")
    public ResponseEntity deleteCaramiziByQuantity(@PathVariable Integer quantity) {
        if (quantity == 0) {
            int rowsEffected = caramidaService.deleteByCantitate(quantity);
            return ResponseEntity.ok("OK au fost sterse " + rowsEffected + "randuri din DB");
        } else {
            return ResponseEntity.badRequest().body("Nu a fost sters");
        }
    }
}
