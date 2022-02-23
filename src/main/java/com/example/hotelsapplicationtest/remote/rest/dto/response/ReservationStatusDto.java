package com.example.hotelsapplicationtest.remote.rest.dto.response;

import com.example.hotelsapplicationtest.domain.model.StatusType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ReservationStatusDto {

    private StatusType status;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date NEW;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date IN_PROGRESS;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date CANCELED;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date READY;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(StatusType status, Date NEW, Date IN_PROGRESS, Date CANCELED, Date READY) {
        this.status = status;
        this.NEW = NEW;
        this.IN_PROGRESS = IN_PROGRESS;
        this.CANCELED = CANCELED;
        this.READY = READY;
    }
}
