package org.example;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void startAuto (String brand, String model) {
        System.out.println("Auto" + brand +" " + model + " ist gestartet!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public void accelerateCar (int speed) {
        this.speed += speed;
    }
}
