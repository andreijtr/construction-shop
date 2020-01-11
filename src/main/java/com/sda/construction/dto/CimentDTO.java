package com.sda.construction.dto;

public class CimentDTO {

    private String tip;
    private String producator;
    private double pret;
    private int cantitate;

    public CimentDTO(String tip, String producator, double pret, int cantitate) {
        this.tip = tip;
        this.producator = producator;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public CimentDTO() {
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
