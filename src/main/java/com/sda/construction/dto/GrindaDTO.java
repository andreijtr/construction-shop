package com.sda.construction.dto;

public class GrindaDTO {

    private double lungime;
    private double grosime;
    private String lemn;
    private double pret;
    private int cantitate;

    public GrindaDTO() {
    }

    public GrindaDTO(double lungime, double grosime, String lemn, double pret, int cantitate) {
        this.lungime = lungime;
        this.grosime = grosime;
        this.lemn = lemn;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getGrosime() {
        return grosime;
    }

    public void setGrosime(double grosime) {
        this.grosime = grosime;
    }

    public String getLemn() {
        return lemn;
    }

    public void setLemn(String lemn) {
        this.lemn = lemn;
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
