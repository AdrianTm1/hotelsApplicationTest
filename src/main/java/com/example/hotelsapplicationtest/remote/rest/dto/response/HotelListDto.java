package com.example.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelListDto {

    private int id;
    private String name;
    private List<RoomListDto> rooms;

    public HotelListDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomListDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomListDto> rooms) {
        this.rooms = rooms;
    }

    public HotelListDto(int id, String name, List<RoomListDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;



    }
}
