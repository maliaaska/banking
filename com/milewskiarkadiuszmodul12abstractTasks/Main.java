package com.milewskiarkadiuszmodul12abstractTasks;

public class Main {
    public static void main(String[] args) {

        Engine carEngine = new Engine("V8", FuelType.DIESEL);
        Vehicle_PoweredVehicle car1 = new Car("Opel", "Astra", 4, 9.78, carEngine);
        System.out.println(car1);


        Engine motoEngine = new Engine("V2", FuelType.PETROL);
        Vehicle_PoweredVehicle motorcycle = new Motorcycle("152", "Yamaha", true, 4.5, motoEngine);
        System.out.println(motorcycle);

        Bicycle bicycle = new Bicycle("24", "Giant", 5, true);
        System.out.println(bicycle);

        // Tworzenie tablicy pojazdów
        Vehicle_PoweredVehicle[] vehicles = new Vehicle_PoweredVehicle[]{car1, motorcycle};

        // Tworzenie obiektu RacingTeam
        RacingTeam team = new RacingTeam(vehicles);

        // Sprawdzanie, czy zespół może pokonać daną trasę z dostępną ilością paliwa
        int distance = 100;
        double fuelAmount = 25.0;
        if (team.canRace(distance, fuelAmount)) {
            System.out.println("The racing team can complete the race.");
        } else {
            System.out.println("The racing team cannot complete the race.");
        }
//
//        // Uruchamianie wszystkich pojazdów w zespole
//        team.startAllVehicles();
//
//        // Włączanie alarmu we wszystkich pojazdach w zespole
//        team.turnOnAllAlarms();
//
//        // Wyłączanie alarmu we wszystkich pojazdach w zespole
//        team.turnOffAllAlarms();
    }

}