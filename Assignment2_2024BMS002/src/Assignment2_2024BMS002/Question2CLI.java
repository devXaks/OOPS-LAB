package Assignment2_2024BMS002;

public class Question2CLI {
    public static void main(String[] args) {
        //programmed by 2024BMS002
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        if(num1 >= 0 && num2 >= 0) {
            int result = (int) Math.pow(num1,num2);
            System.out.println(num1 + " ^ " + num2 + " = " + result);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
