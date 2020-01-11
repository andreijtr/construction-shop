package com.sda.construction.service;

import com.sda.construction.dto.CimentDTO;
import com.sda.construction.entities.Ciment;
import com.sda.construction.repository.CimentDAO;
import com.sda.construction.rest.CimentController;
import com.sda.construction.service.convertors.CimentConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CimentService {

    @Autowired
    private CimentDAO cimentDAO;

    @Autowired
    private CimentConvertor cimentConvertor;

    public void saveCiment(CimentDTO cimentDTO) {
        Ciment ciment = cimentConvertor.convertCimentDTOToCiment(cimentDTO);
        cimentDAO.saveOrUpdate(ciment);
    }

    public List<CimentDTO> findByProducator(String producator) {
        List<Ciment> cimentList = cimentDAO.findByProducator(producator);
        List<CimentDTO> cimentDTOList = new ArrayList<>();

        for (Ciment ciment : cimentList) {
            CimentDTO cimentDTO = new CimentDTO();
            cimentDTO.setTip(ciment.getTip());
            cimentDTO.setProducator(ciment.getProducator());
            cimentDTO.setCantitate(ciment.getCantitate());
            cimentDTO.setPret(ciment.getPret());
            cimentDTOList.add(cimentDTO);
        }

        return cimentDTOList;
    }
}
