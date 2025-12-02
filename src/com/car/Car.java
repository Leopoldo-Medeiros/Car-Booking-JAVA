package com.car;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

// Declaring a class
public class Car {

    // A unique identifier for the system, should NOT change.
    private final UUID id;
    // These properties are fixed for agiven car and should NOT change
    private final String regNumber;
    private final BigDecimal price;
    private final Brand brand;
    private final boolean isElectric;

    // This property represents the state of the car and WILL change
    private boolean isAvailable;

    // Constructor
    public Car(UUID id, String regNumber, BigDecimal price, Brand brand, boolean isElectric, boolean isAvailable) {
        this.id = id;
        this.regNumber = regNumber;
        this.price = price;
        this.brand = brand;
        this.isElectric = isElectric;
        // The availability is now correctly set from the constructor parameter
        this.isAvailable = isAvailable;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", regNumber='" + regNumber + '\'' +
                ", price=" + price +
                ", brand=" + brand +
                ", isElectric=" + isElectric +
                ", isAvailable=" + isAvailable + // Added for completeness
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return isElectric == car.isElectric && isAvailable == car.isAvailable && Objects.equals(id, car.id) && Objects.equals(regNumber, car.regNumber) && Objects.equals(price, car.price) && brand == car.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regNumber, price, brand, isElectric, isAvailable);
    }
}