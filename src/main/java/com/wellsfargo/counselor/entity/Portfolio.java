package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(String creationDate) {
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
