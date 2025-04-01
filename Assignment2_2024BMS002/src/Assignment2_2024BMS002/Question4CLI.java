package Assignment2_2024BMS002;

public class Question4CLI {
    public static void main(String[] args) {
        //programmed by 2024BMS002
        double dob1 = Double.parseDouble(args[0]);
        double ans =  Math.cos(5*dob1)+Math.sin(7*dob1);
        System.out.println("The value of cos(5"+dob1+") + "+"sin(7"+dob1+") is : "+ ans);
    }
}
