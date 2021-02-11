package com.tw;

import java.util.Scanner;

public class Main {

    private static DriveThrough driveThrough;

    public static void main(String[] args) {
        driveThrough = new DriveThrough();
        Scanner scanner = new Scanner(System.in);

        recursivelyAddNewCars(scanner);
        recursivelyCallNext(scanner);
    }

    private static void recursivelyCallNext(Scanner scanner) {
        System.out.println("Call Next!");
        scanner.nextLine();
        driveThrough.next();
        System.out.println(driveThrough.print());
        recursivelyCallNext(scanner);
    }

    private static void recursivelyAddNewCars(Scanner scanner) {
        System.out.println("Add car to queue (x,y)");
        String newCarInput = scanner.nextLine();
        createCar(newCarInput);

        System.out.println("Add more cars? (y/n)");
        String moreCarsDecision = scanner.nextLine();

        if(moreCarsDecision.equalsIgnoreCase("y")) recursivelyAddNewCars(scanner);
    }

    private static void createCar(String newCarInput) {
        String[] split = newCarInput.trim().split(",");
        Car car = new Car(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        driveThrough.queueCar(car);
    }
}
