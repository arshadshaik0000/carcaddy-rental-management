package com.pms.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int carId;

    private String vehicleType;
    private String model;
    private int yearOfManufacture;
    private String licencePlateNumber;
    private String registrationCertificate;
    private String fuelType;
    private double mileage;
    private double startKm;
    private double endKm;
    private double rentRate;
    private String status;

    private LocalDate lastMaintenanceDate;

    private LocalDate nextMaintenanceDate;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Rent_Booking> bookings;

    @OneToOne(mappedBy = "assignedCar")
    @JsonIgnore
    private Employee emp;
}
