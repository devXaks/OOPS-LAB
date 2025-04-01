package question8b;
import question8.Test;
public class Main extends Test implements Sports {
    public void calculateTotal() {
        int total = mark1 + mark2 + score1 + score2;
        showDetails();
        System.out.println("Sports Score1: " + score1);
        System.out.println("Sports Score2: " + score2);
        System.out.println("Grand Total Marks & Score: " + total);
    }

    public static void main(String[] args) {
        Main studentResult = new Main();
        studentResult.inputDetails();
        studentResult.calculateTotal();
    }
}
