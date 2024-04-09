package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Porfolio {

    @Id
    @GeneratedValue()
    private long PorfolioId;

    @OneToOne
    private Client client;

    protected Porfolio() {

    }


    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPorfolioId() {
        return PorfolioId;
    }

    public Client getCLient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    #Change