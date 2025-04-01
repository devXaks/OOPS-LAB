package Assignment4_2024BMS002;

import java.util.Scanner;

public class Question10a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j-1) + " ");
            }
            System.out.println();
            sc.close();
        }
    }
    }

