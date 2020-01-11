package com.sda.construction.service;

import com.sda.construction.dto.CaramidaDTO;
import com.sda.construction.entities.Caramida;
import com.sda.construction.repository.CaramidaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CaramidaService {

    @Autowired
    private CaramidaDAO caramidaDAO;

    public CaramidaDTO getCaramidaByTip(String tip) {
        Caramida caramida = caramidaDAO.findByTip(tip);
        CaramidaDTO caramidaDTO = new CaramidaDTO();
        caramidaDTO.setTip(caramida.getTip());
        caramidaDTO.setProducator(caramida.getProducator());
        caramidaDTO.setPret(caramida.getPret());
        caramidaDTO.setCantitate(caramida.getCantitate());
        return caramidaDTO;
    }

    public List<CaramidaDTO> getAllCaramizi() {
        List<CaramidaDTO> caramiziDTO = new ArrayList<>();
        List<Caramida> caramizi = caramidaDAO.findAll();

        for (Caramida caramida : caramizi) {
            CaramidaDTO caramidaDTO = new CaramidaDTO();
            caramidaDTO.setTip(caramida.getTip());
            caramidaDTO.setProducator(caramida.getProducator());
            caramidaDTO.setPret(caramida.getPret());
            caramidaDTO.setCantitate(caramida.getCantitate());
            caramiziDTO.add(caramidaDTO);
        }

        return caramiziDTO;
    }

    public int deleteByCantitate(int cantitate) {
        return caramidaDAO.deleteByCantitate(cantitate);
    }
}
