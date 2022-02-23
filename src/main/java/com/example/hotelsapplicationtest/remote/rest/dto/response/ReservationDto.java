package com.example.hotelsapplicationtest.remote.rest.dto.response;

import com.example.hotelsapplicationtest.remote.rest.dto.request.PersonDto;
import com.example.hotelsapplicationtest.remote.rest.dto.request.RoomsReservationDto;

import java.util.List;

public class ReservationDto {

    private int id;
    private ReservationStatusDto status;
    private List<RoomsReservationDto> roomsReservation;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(int id, ReservationStatusDto status, List<RoomsReservationDto> roomsReservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReservationStatusDto getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusDto status) {
        this.status = status;
    }

    public List<RoomsReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
