package Assignment2_2024BMS002;

import java.util.Scanner;

public class Question6 {
    public static void main (String[] args){
        double time;
        Scanner sc = new Scanner(System.in);
        double distance;
        System.out.print("Enter the number of seconds: ");
        time = sc.nextDouble();
        distance = (1f/2)*32.174*time*time;
        System.out.println("Distance travelled: " + distance);
        sc.close();
    }
}
