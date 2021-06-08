package com.tw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static DriveThrough driveThrough;
    private static Scanner scanner;

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        driveThrough = new DriveThrough(cars);
        scanner = new Scanner(System.in);

        recursivelyAddNewCars();
        recursivelyCallNext();
    }

    private static void recursivelyCallNext() {
        System.out.println("==========");
        System.out.println("Call Next!");
        scanner.nextLine();

        driveThrough.next();

        System.out.println(driveThrough.print());
        recursivelyCallNext();
    }

    private static void recursivelyAddNewCars() {
        System.out.println("==========");
        System.out.println("Add car to queue (x,y)");
        String newCarInput = scanner.nextLine();

        createCar(newCarInput);

        System.out.println("==========");
        System.out.println("Add more cars? (y/n)");
        String moreCarsDecision = scanner.nextLine();

        if(moreCarsDecision.equalsIgnoreCase("y")) recursivelyAddNewCars();
    }

    private static void createCar(String newCarInput) {
        String[] split = newCarInput.trim().split(",");
        Car car = new Car(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        driveThrough.queueCar(car);
    }
}
