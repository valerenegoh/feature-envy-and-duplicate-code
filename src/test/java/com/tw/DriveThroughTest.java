package com.tw;

import com.tw.Car;
import com.tw.DriveThrough;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DriveThroughTest {

    DriveThrough driveThrough;

    @BeforeEach
    public void setUp() {
        Car firstCar = new Car(1,2);

        List<Car> cars = new ArrayList<>();
        cars.add(firstCar);

        driveThrough = new DriveThrough(cars);
    }

    @Test
    public void shouldPrintCurrentCarPosition() {
        String printStatement = driveThrough.print();

        Assertions.assertEquals("\nCar at: 1, 2", printStatement);
    }

    @Test
    public void shouldPrintNextPositionWhenNextExecuted() {
        driveThrough.next();
        String printStatement = driveThrough.print();

        Assertions.assertEquals("\nCar at: 2, 3", printStatement);
    }

    @Test
    public void shouldPrintAdditionalCarWhenMoreCarQueued() {
        Car secondCar = new Car(2,4);
        driveThrough.queueCar(secondCar);
        String printStatement = driveThrough.print();

        Assertions.assertEquals("\nCar at: 1, 2\nCar at: 2, 4", printStatement);
    }
}
