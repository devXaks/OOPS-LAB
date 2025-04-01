package Assignment2_2024BMS002;

public class Question3CLIalter {
    public static void main(String[] args) {
        //programmed by 2024BMS002
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = 0;
        if(num1>=1 && num2>=1 && num1<=6 && num2<=6) {
            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
