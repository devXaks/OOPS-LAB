package Assignment3_2024BMS002;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year : true");
        }
        else {
            System.out.println(year + " is a leap year : false");
        }

    }
}
