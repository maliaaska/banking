package com.milewskiarkadiuszmodul12abstractTasks;

public class RacingTeam extends Vehicle_PoweredVehicle {
    private Vehicle_PoweredVehicle[] vehicles;

    //Dodaj konstruktor przyjmujący tablicę pojazdów i inicjalizujący pole w klasie.
    public RacingTeam (Vehicle_PoweredVehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public boolean canRace(int distance, double fuelAmount) {
        double totalFuelConsumption = 0.0;
        for ( Vehicle_PoweredVehicle vehicle : vehicles ) {
            totalFuelConsumption += vehicle.getFuelConsumption(distance);
        }
        return totalFuelConsumption <= fuelAmount;
    }

    // Dodatkowa metoda do uruchamiania wszystkich pojazdów w zespole
    public void startAllVehicles() {
        for (Vehicle_PoweredVehicle vehicle : vehicles) {
            vehicle.start();
        }
    }

//     Dodatkowa metoda do włączania alarmu we wszystkich pojazdach w zespole
    public void turnOnAllAlarms() {
        for (Vehicle_PoweredVehicle vehicle : vehicles) {
            if (vehicle instanceof Alarm) {
                ((Alarm) vehicle).turnAlarmOn();
            }
        }
    }

    // Dodatkowa metoda do wyłączania alarmu we wszystkich pojazdach w zespole
    public void turnOffAllAlarms() {
        for (Vehicle_PoweredVehicle vehicle : vehicles) {
            if (vehicle instanceof Alarm) {
                ((Alarm) vehicle).turnAlarmOff();
            }
        }
    }

    public Vehicle_PoweredVehicle[] getVehicle() {
        return vehicles;
    }

    public void setVehicle(Vehicle_PoweredVehicle[] vehicle) {
        this.vehicles = vehicles;
    }


    @Override
    public void start() {
        System.out.println("The team started Race");
    }

    @Override
    public void turnOff() {
        System.out.println("The team turned off the engines ");
    }
}
