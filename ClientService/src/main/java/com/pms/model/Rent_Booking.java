package com.pms.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Rent_Booking {

    private int bookingId;
    private Car car;
    private Employee employee;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalFare;
    private int discount;
    private String location;
    private String status;
    private int days;

    private String key;
    private String value;
    
}
