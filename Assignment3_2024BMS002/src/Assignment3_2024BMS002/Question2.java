package Assignment3_2024BMS002;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water drank by Alice in ml: ");
        double water = sc.nextDouble();
        if(water >= 5000){
            System.out.println("Yes, Alice is following doctor’s advice");
        }
        else {
            System.out.println("No, Alice is not following doctor’s advice");
        }
        sc.close();
    }
}
