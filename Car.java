package pl.sda.sklepsamochodowy;

import java.time.LocalDate;

public class Car {

    private CarBrand brand;
    private String name;
    private CarType type;
    private double combustion;
    private double engineSize;
    private int numberOfSeats;
    private int enginePower;
    private LocalDate productionDate;
    private boolean automatic;
    private CarDrive drive;

    public Car(CarBrand brand, String name, CarType type, double combustion, double engineSize, int numberOfSeats, int enginePower, LocalDate productionDate, boolean automatic, CarDrive drive) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.combustion = combustion;
        this.engineSize = engineSize;
        this.numberOfSeats = numberOfSeats;
        this.enginePower = enginePower;
        this.productionDate = productionDate;
        this.automatic = automatic;
        this.drive = drive;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public CarType getType() {
        return type;
    }

    public double getCombustion() {
        return combustion;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public CarDrive getDrive() {
        return drive;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public void setDrive(CarDrive drive) {
        this.drive = drive;
    }
}
