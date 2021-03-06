package com.sda.construction.service;

import com.sda.construction.dto.GrindaDTO;
import com.sda.construction.entities.Grinda;
import com.sda.construction.repository.GrindaDAO;
import com.sda.construction.service.convertors.GrindaConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrindaService {

    @Autowired
    private GrindaDAO grindaDAO;

    @Autowired
    private GrindaConvertor grindaConvertor;

    public List<GrindaDTO> findByParameters(GrindaDTO grindaDTO) {
        Grinda grinda = grindaConvertor.convertGrindaDTOInGrinda(grindaDTO);
        List<Grinda> grindaList = grindaDAO.findByParameters(grinda);
        return grindaConvertor.convertGrindaListToGrindaDTOList(grindaList);
    }

    public void saveGrinda(GrindaDTO grindaDTO) {
        Grinda grinda = grindaConvertor.convertGrindaDTOInGrinda(grindaDTO);
        grindaDAO.saveOrUpdate(grinda);
    }

    public List<GrindaDTO> findAll() {
        List<GrindaDTO> grinziDTO = new ArrayList<>();
        List<Grinda> grinzi = grindaDAO.findAll();

        for (Grinda grinda : grinzi) {
            GrindaDTO grindaDTO = new GrindaDTO();
            grindaDTO.setLungime(grinda.getLungime());
            grindaDTO.setGrosime(grinda.getGrosime());
            grindaDTO.setCantitate(grinda.getCantitate());
            grindaDTO.setLemn(grinda.getLemn());
            grindaDTO.setPret(grinda.getPret());
            grinziDTO.add(grindaDTO);
        }

        return grinziDTO;
    }

    public List<GrindaDTO> findByLemn(String lemn) {
        List<GrindaDTO> grinziDTO = new ArrayList<>();
        List<Grinda> grinzi = grindaDAO.findByLemn(lemn);

        for (Grinda grinda : grinzi) {
            GrindaDTO grindaDTO = new GrindaDTO();
            grindaDTO.setLungime(grinda.getLungime());
            grindaDTO.setGrosime(grinda.getGrosime());
            grindaDTO.setCantitate(grinda.getCantitate());
            grindaDTO.setLemn(grinda.getLemn());
            grindaDTO.setPret(grinda.getPret());
            grinziDTO.add(grindaDTO);
        }

        return grinziDTO;
    }


}
