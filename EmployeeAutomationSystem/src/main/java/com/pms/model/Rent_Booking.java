package com.pms.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Rent_Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @FutureOrPresent(message = "Booking Date Should Be Either Current Or Future Date")
    @NotNull(message = "Start Can't Be Empty")
    private LocalDate startDate;

    @Future(message = "Booking End Date Should Be Future Date")
    @NotNull(message = "End Date Can't Be Empty")
    private LocalDate endDate;

    private double totalFare;

    @NotNull(message = "Discount Can't Be Empty")
    @Min(value = 1, message = "Discount Must Be At least 1")
    @Max(value = 10, message = "Discount Must Be At Most 10")
    private int discount;

    @NotEmpty(message = "Location Can't Be Empty")
    private String location;

    @NotEmpty(message = "Status Can't Be Empty")
    private String status;

    private int days;
}
