package com.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private String regNumber;
    private BigDecimal price;
    private Brand brand;
    private boolean isElectric;

    public Car(String regNumber, BigDecimal price, Brand brand, boolean isElectric) {
        this.regNumber = regNumber;
        this.price = price;
        this.brand = brand;
        this.isElectric = isElectric;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", price=" + price +
                ", brand=" + brand +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isElectric == car.isElectric && Objects.equals(regNumber, car.regNumber) && Objects.equals(price, car.price) && brand == car.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, price, brand, isElectric);
    }
}
