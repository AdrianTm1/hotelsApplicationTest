package com.example.hotelsapplicationtest.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomListDto {

    private int id;
    private int beds;
    private BigDecimal price;

    public RoomListDto() {
    }

    public RoomListDto(int id, int beds, BigDecimal price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
