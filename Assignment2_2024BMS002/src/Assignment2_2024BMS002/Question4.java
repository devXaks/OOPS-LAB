package Assignment2_2024BMS002;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();
        if (num < 0 || num > 1000) {
            System.out.println("Invalid input");
        } else {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            System.out.println("The sum of the digits is " + sum);
            scanner.close();

        }


    }
}
