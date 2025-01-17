package com.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.exceptions.InvalidEntityException;
import com.pms.exceptions.NoDataFoundException;
import com.pms.model.Car;
import com.pms.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car getCarById(int id) throws InvalidEntityException {
        return carRepository.findById(id)
                .orElseThrow(() -> new InvalidEntityException("Car with ID " + id + " not found."));
    }

    public List<Car> getAllBookings() throws NoDataFoundException {
        List<Car> cars = carRepository.findAll();
        if (cars.isEmpty()) {
            throw new NoDataFoundException("No bookings found.");
        }
        return cars;
    }
}
