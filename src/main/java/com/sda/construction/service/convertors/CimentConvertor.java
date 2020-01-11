package com.sda.construction.service.convertors;

import com.sda.construction.dto.CimentDTO;
import com.sda.construction.entities.Ciment;
import org.springframework.stereotype.Component;

@Component
public class CimentConvertor {

    public Ciment convertCimentDTOToCiment(CimentDTO cimentDTO) {
        Ciment ciment = new Ciment();
        ciment.setProducator(cimentDTO.getProducator());
        ciment.setCantitate(cimentDTO.getCantitate());
        ciment.setTip(cimentDTO.getTip());
        ciment.setPret(cimentDTO.getPret());
        return ciment;
    }
}
