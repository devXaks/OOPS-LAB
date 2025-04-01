
package Assignment3_2024BMS002;
import java.util.Scanner;

public class Question8 {
    //programmed by 2024BMS002;
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter x-coordinate: ");
            double x = sc.nextDouble();
            System.out.print("Enter y-coordinate: ");
            double y = sc.nextDouble();
            if (x == 0 && y == 0) {
                System.out.println("The point (0.0, 0.0) is at the origin.");
            }
            else if (x == 0) {
                System.out.println("(" + x + ", " + y + ") is on the y-axis.");
            }
            else if (y == 0) {
                System.out.println("(" + x + ", " + y + ") is on the x-axis.");
            }
            else if (x > 0 && y > 0) {
                System.out.println("(" + x + ", " + y + ") is in quadrant I.");
            }
            else if (x < 0 && y > 0) {
                System.out.println("(" + x + ", " + y + ") is in quadrant II.");
            }
            else if (x < 0 && y < 0) {
                System.out.println("(" + x + ", " + y + ") is in quadrant III.");
            }
            else {
                System.out.println("(" + x + ", " + y + ") is in quadrant IV.");
            }

            sc.close();
        }
    }        


