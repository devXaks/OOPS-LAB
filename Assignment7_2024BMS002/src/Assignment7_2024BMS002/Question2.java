package Assignment7_2024BMS002;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter an natural number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
           if( a%2 != 0){
               throw new ArithmeticException();
           }
           else{
               System.out.println("Even number");
           }
        }
        catch(ArithmeticException e){
            System.out.println("The number is odd");
        }
        finally{
            System.out.println("Program executed successfully");
        }
            }
}
