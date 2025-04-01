package Assignment2_2024BMS002;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere: ");
        radius = sc.nextDouble();
        double surfacearea,volume;
        surfacearea = 3*Math.PI * radius * radius;
        volume = (2.0/3)*Math.PI*radius * radius*radius;
        System.out.println("The surface area of the hemisphere is " + surfacearea);
        System.out.println("The volume of the hemisphere is " + volume);
        sc.close();
    }


}
