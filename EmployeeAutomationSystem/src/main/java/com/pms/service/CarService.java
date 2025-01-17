package com.pms.service;

import java.util.List;

import com.pms.exceptions.InvalidEntityException;
import com.pms.exceptions.NoDataFoundException;
import com.pms.model.Car;

public interface CarService {
   public Car getCarById(int id) throws InvalidEntityException;
   public List<Car> getAllBookings() throws NoDataFoundException;

}
