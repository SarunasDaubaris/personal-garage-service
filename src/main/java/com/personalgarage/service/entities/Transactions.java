package com.personalgarage.service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "transactions")
public final class Transactions {

    @Id
    private String id;
    private String transactionsTypes;
    private Long timestamp;
    private BigDecimal amount;
    private String description;

    public Transactions() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionsTypes() {
        return transactionsTypes;
    }

    public void setTransactionsTypes(String transactionsTypes) {
        this.transactionsTypes = transactionsTypes;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}