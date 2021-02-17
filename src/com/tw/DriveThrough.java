package com.tw;

import java.util.List;

public class DriveThrough {
    private List<Car> cars;

    public DriveThrough(List<Car> cars) {
        this.cars = cars;
    }

    public void next(){
        cars.forEach(car -> {
            car.y++;
            car.x++;
        });
    }

    public void queueCar(Car car) {
        cars.add(car);
    }

    public String print() {
        StringBuilder output = new StringBuilder();
        cars.forEach(car -> {
            output.append("\nCar at: ").append(car.x).append(", ").append(car.y);
        });
        return output.toString();
    }
}
