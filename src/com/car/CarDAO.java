package com.car;

import java.math.BigDecimal;
import java.util.UUID;

public class CarDAO {

    private static final Car[] CARS;

    // Use a static block to initialize the array
    static {
        CARS = new Car[]{
                // The constructor call now matches the corrected Car class
                new Car(UUID.randomUUID(), "1", new BigDecimal("89.90"), Brand.TESLA, true, true),
                new Car(UUID.randomUUID(), "2", new BigDecimal("128.50"), Brand.HONDA, false, true),
                new Car(UUID.randomUUID(), "3", new BigDecimal("98.75"), Brand.MERCEDES, false, false)
        };
    }

    public Car[] getAllCars() {
        return CARS;
    };
}