package com.car;

public class CarDAO {

    // This class is responsible for providing the car data to the rest of the application
    private static final Car[] = CARS = {
            new Car("1", new BigDecimal("89.90", Brand.TESLA, true));
            new Car("2", new BigDecimal("128.50", Brand.HONDA, false));
            new CAr("3", new BigDecimal("98.75", Brand.MERCEDES, false));
    };

    public Car[] getAllCArs() {
        return CARS;
    }
}