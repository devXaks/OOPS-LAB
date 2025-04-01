package Assignment3_2024BMS002;
import java.util.Scanner;

public class Question6 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of units consumed: ");
            int units = sc.nextInt();
            double bill = 0;

            if (units <= 50) {
                bill = units * 3;
            } else if (units <= 200) {
                bill = 50 * 3 + (units - 50) * 4.80;
            } else if (units <= 400) {
                bill = 50 * 3 + 150 * 4.80 + (units - 200) * 5.80;
            } else {
                bill = 50 * 3 + 150 * 4.80 + 200 * 5.80 + (units - 400) * 6.20;
            }

            System.out.println("Total electricity bill: Rs. " + bill);
            sc.close();
        }
    }

