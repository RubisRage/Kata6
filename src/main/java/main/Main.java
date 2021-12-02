package main;

import toys.Car;
import toys.SerialNumberGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        SerialNumberGenerator numberGenerator = new SerialNumberGenerator();

        Scanner scanner = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();

        String command;
        while(!"exit".equals(command = scanner.nextLine())){
            Car tmp = new Car(numberGenerator.next());
            tmp.pack(); tmp.label();

            cars.add(tmp);
            System.out.println("Built cars: " + cars.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
        }

    }
}
