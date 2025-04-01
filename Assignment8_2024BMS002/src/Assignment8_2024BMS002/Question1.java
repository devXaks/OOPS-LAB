package Assignment8_2024BMS002;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor : ");
        int divisor = sc.nextInt();

        try{
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            System.out.println("The quotient is " + quotient + " and the remainder is " + remainder);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        sc.close();

    }
}
