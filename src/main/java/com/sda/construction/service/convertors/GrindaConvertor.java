package com.sda.construction.service.convertors;

import com.sda.construction.dto.GrindaDTO;
import com.sda.construction.entities.Grinda;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GrindaConvertor {

    public Grinda convertGrindaDTOInGrinda(GrindaDTO grindaDTO) {
        Grinda grinda = new Grinda();
        grinda.setLungime(grindaDTO.getLungime());
        grinda.setGrosime(grindaDTO.getGrosime());
        grinda.setCantitate(grindaDTO.getCantitate());
        grinda.setLemn(grindaDTO.getLemn());
        grinda.setPret(grindaDTO.getPret());
        return grinda;
    }

    public GrindaDTO convertGrindaToGrindaDTO(Grinda grinda) {
        GrindaDTO grindaDTO = new GrindaDTO();
        grindaDTO.setLungime(grinda.getLungime());
        grindaDTO.setCantitate(grinda.getCantitate());
        grindaDTO.setPret(grinda.getPret());
        grindaDTO.setGrosime(grinda.getGrosime());
        grindaDTO.setLemn(grinda.getLemn());
        return grindaDTO;
    }

    public List<GrindaDTO> convertGrindaListToGrindaDTOList(List<Grinda> grindaList) {
        List<GrindaDTO> grindaDTOList = new ArrayList<>();
        for (Grinda grinda : grindaList) {
            grindaDTOList.add(convertGrindaToGrindaDTO(grinda));
        }
        return grindaDTOList;
    }
}
