package Assignment2_2024BMS002;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //programmed by 2024BMS002
        double distance;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the distance in km = ");
        distance = s.nextDouble();

        double distanceIn = distance*39370.0787;
        double distanceCm = distance*100000;
        double distanceMeter = distance*1000;
        double distanceFeet = distance*3280.8399;

        System.out.println(distance + " km is "+ distanceMeter + " meters");
        System.out.println(distance + " km is "+ distanceFeet + " feet");
        System.out.println(distance + " km is "+ distanceIn + " inch");
        System.out.println(distance + " km is "+ distanceCm + " centimeters");

    }
}
