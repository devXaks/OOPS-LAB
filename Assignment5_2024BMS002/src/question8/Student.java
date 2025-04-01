package question8;
import java.util.Scanner;

public class Student {
    protected String name;
    protected int roll;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = sc.nextLine();
        System.out.print("Enter your Roll Number: ");
        roll = sc.nextInt();
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}
