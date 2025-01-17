package com.pms.model;

import java.util.List;
import lombok.Data;

@Data
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String gender;
    private int loyaltyPoints;
    private boolean blocklistStatus;
    private String password;
    private List<Rent_Booking> bookings;
}
