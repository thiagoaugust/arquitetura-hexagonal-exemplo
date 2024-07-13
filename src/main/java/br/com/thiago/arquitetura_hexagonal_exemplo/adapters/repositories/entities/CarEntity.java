package br.com.thiago.arquitetura_hexagonal_exemplo.adapters.repositories.entities;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.models.Car;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ParkedCars")
public class CarEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plate;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private Double totalBill;

    public CarEntity() {}

    public CarEntity(Car car) {
        this.id = car.getId();
        this.plate = car.getPlate();
        this.checkin = car.getCheckin();
        this.checkout = car.getCheckout();
        this.totalBill = car.getTotalBill();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public Car toCar() {
        return new Car(this.id, this.plate, this.checkin, this.checkout, this.totalBill);
    }
}
