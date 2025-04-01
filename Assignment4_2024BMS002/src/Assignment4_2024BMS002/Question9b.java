package Assignment4_2024BMS002;

import java.util.Scanner;

public class Question9b {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows ");
         int rows = sc.nextInt();
         for(int i = 1; i <= rows; i++) {
             for(int j = 1; j <= i; j++) {
                 System.out.print(i+ " ");
             }
             System.out.println();
             sc.close();
         }
    }
}
