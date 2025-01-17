package com.pms.model;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class Car {

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
    private List<Rent_Booking> bookings;
    private Employee emp;
}
