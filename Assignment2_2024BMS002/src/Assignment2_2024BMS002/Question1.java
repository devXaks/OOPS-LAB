package Assignment2_2024BMS002;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // programmed by 2024BMS002;
        Scanner s = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Enter a degree in fahrenheit : ");
        fahrenheit = s.nextDouble();
        double celsius = (fahrenheit - 32)*5.0/9;
        System.out.println(fahrenheit + " fahrenheit in celsius is : "+ celsius);
    }
}
