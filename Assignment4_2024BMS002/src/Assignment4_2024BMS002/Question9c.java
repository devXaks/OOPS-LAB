package Assignment4_2024BMS002;

import java.util.Scanner;

public class Question9c {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        int cnt = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
            sc.close();

        }
    }
}
