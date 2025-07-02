package org.example;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //erstes Auto
        Color   color = new Color(256);
        String brand = "Opel";
        String model = "Corsa";
        int year = 2008;
        Car car = new Car(brand, model, color, year);
        car.startAuto();
        int speedUp = 10;
        car.speedUp(speedUp);

        //zweites Auto
        Color   color2 = new Color(0);
        String brand2 = "Opel";
        String model2 = "Astra";
        int year2 = 2001;
        Car car2 = new Car(brand2, model2, color2, year2);
        car2.startAuto();
        int speedUp2 = 20;
        car2.speedUp(speedUp2);
        car2.speedUp(speedUp2);

        //Objekt Person
        Person yuliia = new Person("Yuliia", 40, false, 72, 164);
        System.out.println(yuliia);
        Person hermann = new Person("Hermann", 67, true, 65, 164);
        System.out.println(hermann);
        Person viki = new Person("Viktoriia", 25, false, 50, 166);
        System.out.println(viki);
    }
}