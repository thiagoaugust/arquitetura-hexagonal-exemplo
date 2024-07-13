package br.com.thiago.arquitetura_hexagonal_exemplo.domain.models;

import java.time.LocalDateTime;

public class Car {

    private String plate;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private Double totalBill;

    public Car(String plate) {
        this.plate = plate;
        this.checkin = LocalDateTime.now();
        this.checkout = null;
        this.totalBill = null;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }
}
