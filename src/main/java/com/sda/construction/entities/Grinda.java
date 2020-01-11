package com.sda.construction.entities;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "findAll", query = "select g from Grinda g"),
        @NamedQuery(name = "findByLemn", query = "select g from Grinda g where g.lemn = :lemn")
})

@Entity
@Table(name = "grinzi")
public class Grinda {
    @Id
    private long id;

    @Column(name = "lungime")
    private double lungime;

    @Column(name = "grosime")
    private double grosime;

    @Column(name = "lemn")
    private String lemn;

    @Column(name = "pret")
    private double pret;

    @Column(name = "cantitate")
    private int cantitate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
