package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
