package com.camp.hospital.model;

import org.springframework.http.HttpStatus;

public class ApiError {
    HttpStatus status;
    String messsage;

    public ApiError(HttpStatus status, String messsage) {
        this.status = status;
        this.messsage = messsage;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
}
