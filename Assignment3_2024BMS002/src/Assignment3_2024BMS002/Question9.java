package Assignment3_2024BMS002;
import java.util.Scanner;

public class Question9 {
     public static void main(String[] args) {
            //programmed by 2024BMS002;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of a, b, c: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int largest = Math.max(a, Math.max(b, c));
            int secondLargest;
            if (a == largest) {
                secondLargest = Math.max(b, c);
            }
            else if (b == largest) {
                secondLargest = Math.max(a, c);
            }
            else {
                secondLargest = Math.max(a, b);
            }

            System.out.println("Largest number: " + largest);
            System.out.println("2nd largest number: " + secondLargest);

            sc.close();
        }
    }


