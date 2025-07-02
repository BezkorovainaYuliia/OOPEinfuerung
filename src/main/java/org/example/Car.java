package org.example;

import java.awt.*;

public class Car {
    private String brand;
    private String model;
    private Color color;
    private int year;
    private int speed;

    public Car(String brand, String model, Color color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }
     public void startAuto(){
         System.out.println("Das Auto ist gestarted");
     }

     public void speedUp(int speedUp) {
        this.speed += speedUp;
         System.out.println("Das Auto fährt snell und die Geschwindigkeit ist " + this.speed);
     }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
