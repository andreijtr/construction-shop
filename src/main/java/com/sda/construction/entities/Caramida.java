package com.sda.construction.entities;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "findCaramidaByTip", query = "select c from Caramida c where c.tip = :tip"),
        @NamedQuery(name = "findAllCaramizi", query = "select c from Caramida c"),
        @NamedQuery(name = "deleteByCantitate", query = "delete from Caramida c where c.cantitate = :cantitate")
})

@Entity
@Table(name = "caramizi")
public class Caramida {

    @Id
    private long id;

    @Column(name = "tip")
    private String tip;

    @Column(name = "producator")
    private String producator;

    @Column(name = "pret")
    private double pret;

    @Column(name = "cantitate")
    private int cantitate;

    public Caramida() {
    }

    public Caramida(String tip, String producator, double pret, int cantitate) {
        this.tip = tip;
        this.producator = producator;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
