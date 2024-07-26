package com.milewskiarkadiuszmodul12abstractTasks;

public class Car extends Vehicle_PoweredVehicle{
    private String make;

    private String name;
    private int numberOfDoors;

    private double consumption;

    private Engine engine;

    public Car ( String make, String name, int numberOfDoors, double consumption) {
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
    }

    public Car (String make, String name, int numberOfDoors, double consumption, String type, FuelType fuelType) {
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
        this.engine = new Engine(type, fuelType);

    }

    @Override
    public void getDescription() {
        super.getDescription();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public FuelType getFuel() {
        return super.getFuel();
    }

    @Override
    public void setFuel(FuelType fuel) {
        super.setFuel(fuel);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Car(String opel, String astra, int i, double v, Engine carEngine) {
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("The Car Drives forward");
    }

    @Override
    public void stop() {
        System.out.println("The car just stopped");
    }

    @Override
    public void start() {
        System.out.println("The engine just turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The engine just turned off");
    }

}
