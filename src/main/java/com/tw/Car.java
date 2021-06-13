package com.tw;

public class Car {
    int x;
    int y;

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(){
        y++;
        x++;
    }

    public String print() {
        StringBuilder output = new StringBuilder();
        output.append("\nCar at: ").append(x).append(", ").append(y);
        return output.toString();
    }
}
