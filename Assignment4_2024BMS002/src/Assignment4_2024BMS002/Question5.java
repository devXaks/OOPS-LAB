package Assignment4_2024BMS002;
import java.util.Scanner;

class TwistedPrime{
    int num;
    int reversenum =0;
    TwistedPrime(int n){
        num = n;
        while(n!=0){
            reversenum = reversenum*10 + n%10;
            n = n/10;
        }
    }
    public void isPrime(){
        boolean isPrimen1 = true;
        boolean isPrimen2 = true;
        for(int i= 2; i<num; i++){
            if(num%i==0){
                isPrimen1 = false;
                break;
            }
        }
        for(int i= 2; i<reversenum; i++){
            if(reversenum%i==0){
                isPrimen2 = false;
            }
        }
        if(isPrimen1 && isPrimen2){
            System.out.println(num + " is a twised prime");
        }
        else{
            System.out.println(num + " is not a twised prime");
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        TwistedPrime twis = new TwistedPrime(num);
        twis.isPrime();
        sc.close();
    }

}
