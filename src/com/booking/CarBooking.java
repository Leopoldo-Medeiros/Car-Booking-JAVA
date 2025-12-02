package com.booking;

import com.car.Car;
import com.user.User;

import java.util.UUID;

public class CarBooking {
    private final UUID bookingId;
    private final User user;
    private final Car car;

    public CarBooking(User user, Car car, UUID bookingId) {
        this.user = user;
        this.car = car;
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public Car getCar() {
        return car;
    }
}