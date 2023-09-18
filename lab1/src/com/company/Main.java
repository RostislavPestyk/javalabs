package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("rostyk");
        double x=0.335;
        double y=0.025;

        System.out.println("S = " + 1 + x + (Math.pow(x,2))/2 + (Math.pow(x,3)/6 + (Math.pow(x,4))/24));

        System.out.println("F = "+ x * (Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2)));

        Date currentTime = new Date();


        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = dateFormat.format(currentTime);
        System.out.println("Поточний час: " + formattedTime);
    }
}
