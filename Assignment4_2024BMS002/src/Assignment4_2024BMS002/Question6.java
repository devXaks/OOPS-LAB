package Assignment4_2024BMS002;
import java.util.Scanner;

class Prime{
    int num1;
    int num2;
    Prime(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    void printPrime(){
        System.out.print("Prime numbers between " + num1 + " and " + num2 + " are : ");
        for(int i = num1+1; i < num2; i++){
            boolean isPrime = true;
            for(int j = 2;j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.print(i + " , ");
            }
        }
    }

}

public class Question6 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        Prime prime = new Prime(num1, num2);
        prime.printPrime();
        sc.close();
    }
}
