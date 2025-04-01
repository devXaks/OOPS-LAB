package Assignment4_2024BMS002;

import java.util.Scanner;

class Factorial{
    int num1;
    int num2;
    Factorial(int n,int m){
        this.num1=n;
        this.num2=m;
    }
    public void fact(){
        int fact=1;
        for(int i=1;i<num1;i++){
            fact*=i;
        }
        for(int j = num1;j<=num2;j++){
            fact *=j;
            System.out.println("Factorial of "+j+" is "+fact);

        }
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int n;
        System.out.print("Enter the value of m : ");
        m = sc.nextInt();
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        Factorial f = new Factorial(m,n);
        f.fact();


    }
}
