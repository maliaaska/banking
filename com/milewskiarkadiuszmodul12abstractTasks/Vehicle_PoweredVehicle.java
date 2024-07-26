package com.milewskiarkadiuszmodul12abstractTasks;

public abstract class Vehicle_PoweredVehicle extends Engine {
    public abstract void start();

    public abstract void turnOff();

    void drive() {
        System.out.println("The vehicle drives");
    };

    void stop() {
        System.out.println("The vehicle stopped");
    };


    //Using a private method in the interface.
    double getFuelConsumption(int kilometers) {
        return 0;
    }

    static int getHorsePower ( int rpm, int torque) {
        return (rpm * torque) / 5252;
    };

    static boolean isFast( int speed ) {
        if (speed < 50 ) {
            System.out.println("the car is slow");
            return false;
        }
        return true;
    }

}
