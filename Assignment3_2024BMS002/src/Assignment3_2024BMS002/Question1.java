package Assignment3_2024BMS002;
import java.util.Scanner;

public class Question1 {
    //programmed by 2024BMS002;
    public static void main(String[] args) {
        System.out.println("Enter the age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to cast your vote");
        }
        else{
            System.out.println("You are not eligible to cast your vote");
        }

    }
}
