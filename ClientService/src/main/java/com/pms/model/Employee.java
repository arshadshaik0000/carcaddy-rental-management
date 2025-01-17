package com.pms.model;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class Employee {

    private int employeeId;
    private String employeeName;
    private LocalDate dateOfBirth;
    private String employeeEmail;
    private String accountType; // temporary or permanent
    private String defaultPassword;
    private String designation;
    private LocalDate accountExpiryDate;
    private String status; // active or inactive
    private List<Rent_Booking> bookings;
    private Car assignedCar;
}
