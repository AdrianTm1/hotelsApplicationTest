package com.example.hotelsapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {

    private List<RoomsReservationDto> RoomsReservation;
    private PersonDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<RoomsReservationDto> roomsReservation, PersonDto person) {
        RoomsReservation = roomsReservation;
        this.person = person;
    }

    public List<RoomsReservationDto> getRoomsReservation() {
        return RoomsReservation;
    }

    public void setRoomsReservation(List<RoomsReservationDto> roomsReservation) {
        RoomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
