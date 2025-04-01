package Assignment4_2024BMS002;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
     //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            sc.close();
        }


    }
}
