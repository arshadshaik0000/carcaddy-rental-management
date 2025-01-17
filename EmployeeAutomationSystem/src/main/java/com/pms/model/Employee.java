package com.pms.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;

	private String employeeName;
	private LocalDate dateOfBirth;
	private String employeeEmail;
	private String accountType; // temporary or permanent
	private String defaultPassword;
	private String designation;
	private LocalDate accountExpiryDate;
	private String status; // active or inactive

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Rent_Booking> bookings;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "car_id")
	private Car assignedCar;
}
