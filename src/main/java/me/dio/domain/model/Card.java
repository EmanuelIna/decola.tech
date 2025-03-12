package me.dio.domain.model;

import java.math.BigDecimal;

public class Card {
    private Long id;
    private String number;
    private BigDecimal Limit;

    //#region getters-setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public BigDecimal getLimit() {
        return Limit;
    }
    public void setLimit(BigDecimal limit) {
        Limit = limit;
    }
    //#endregion
    
}
