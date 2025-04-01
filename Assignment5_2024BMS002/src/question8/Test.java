package question8;
import java.util.Scanner;

public class Test extends Student {
    protected int mark1, mark2;
    public void inputDetails() {
        super.inputDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Marks2: ");
        mark2 = sc.nextInt();
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("Marks1: " + mark1);
        System.out.println("Mark2s: " + mark2);
    }
}