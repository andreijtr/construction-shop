package com.sda.construction.entities;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "findByProducator", query = "select c from Ciment c where c.producator = :producator")
})

@Entity
@Table(name = "ciment")
public class Ciment {

    @Id
    private int id;

    @Column(name = "tip")
    private String tip;

    @Column(name = "producator")
    private String producator;

    @Column(name = "pret")
    private double pret;

    @Column(name = "cantitate")
    private int cantitate;

    public Ciment(String tip, String producator, double pret, int cantitate) {
        this.tip = tip;
        this.producator = producator;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public Ciment() {
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
