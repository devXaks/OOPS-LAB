package Assignment2_2024BMS002;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //programmed by 2024BMS002;
        double basicsalary,dearnessallowance,houserentallowance ,grosssalary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basicsalary = input.nextDouble();
        dearnessallowance = basicsalary * 0.4;
        houserentallowance = basicsalary * 0.2;
        grosssalary = basicsalary + dearnessallowance + houserentallowance;
        System.out.println("DA is "+dearnessallowance);
        System.out.println("HRA is "+houserentallowance);
        System.out.printf("Gross salary is "+grosssalary);
        input.close();


    }
}
