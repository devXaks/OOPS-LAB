package Assignment8_2024BMS002;

import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Number: ");
    String number = sc.nextLine();
    try{
        double num = Double.parseDouble(number);
        System.out.println("Valid number found");
    }
    catch(NumberFormatException e){
        System.out.println("Not a number");
    }
}
}
