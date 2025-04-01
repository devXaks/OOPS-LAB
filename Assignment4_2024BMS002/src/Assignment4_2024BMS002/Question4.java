package Assignment4_2024BMS002;
import java.util.Scanner;

class AmicableNumber{
    int num1;
    int num2;

    AmicableNumber(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int sum1 = 0;
    int sum2 = 0;
    public void check(){
        for(int i = 1; i < num1; i++){
            if(num1%i == 0){
                sum1+=i;
            }
        }
        for(int j = 1; j < num2; j++){
            if(num2%j == 0){
                sum2+=j;
            }
        }
        if(sum1 == num2 && sum2 == num1){
            System.out.println(num1 + " and " + num2 +" are amicable numbers ");
        }
        else{
            System.out.println(num1 + " and " + num2 +" are not amicable numbers");
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        AmicableNumber a1 = new AmicableNumber(num1,num2);
        a1.check();

    }
}
