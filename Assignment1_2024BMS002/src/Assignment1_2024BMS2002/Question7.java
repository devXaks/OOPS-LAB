package Assignment1_2024BMS2002;

public class Question7 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        int a = 10;
        int b = 20;
        System.out.println("The value before swapping is a: "+ a + " b: "+b);
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println("The value after swapping is a: "+ a + " b: "+b);
    }
}
