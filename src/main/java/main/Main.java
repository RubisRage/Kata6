package main;

import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
import toys.ToyBussiness;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        SerialNumberGenerator numberGenerator = new SerialNumberGenerator();

        Scanner scanner = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();

        ToyBussiness toyBussiness = new ToyBussiness();

        String command;
        while(!"exit".equals(command = scanner.nextLine())){

            switch (command) {
                case "car" -> {
                    Car c =  toyBussiness.createCar();
                    cars.add(c);
                    System.out.println("Built cars: " + cars.stream().map(x -> x.getSerialNumber().toString()).
                            collect(Collectors.joining(", ")));
                }

                case "helicopter" -> {
                    Helicopter h = toyBussiness.createHelicopter();
                    helicopters.add(h);

                    System.out.println("Built helicopters: " + helicopters.stream().map(x -> x.getSerialNumber().toString()).
                            collect(Collectors.joining(", ")));
                }

                default -> System.out.println("Unknown command!");
            }
        }

        System.out.println("Exiting...");
    }
}
