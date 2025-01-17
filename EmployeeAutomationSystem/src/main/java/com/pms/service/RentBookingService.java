package com.pms.service;

import java.util.List;

import com.pms.exceptions.InvalidEntityException;
import com.pms.exceptions.NoDataFoundException;
import com.pms.model.Rent_Booking;

public interface RentBookingService {

    public Rent_Booking addBooking(Rent_Booking booking) throws InvalidEntityException;
    public List<Rent_Booking> getAllBookings() throws NoDataFoundException;
    public Rent_Booking getBookingById(int id) throws InvalidEntityException;
    public Rent_Booking updateBooking(int id, Rent_Booking updatedBooking) throws InvalidEntityException;
    public void deleteBooking(int id) throws InvalidEntityException;

}
