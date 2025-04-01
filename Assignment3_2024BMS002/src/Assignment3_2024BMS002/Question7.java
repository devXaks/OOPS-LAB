    package Assignment3_2024BMS002;
    import java.util.Scanner;

    public class Question7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out. print("Enter the total number of units consumed: ");
            int units = sc.nextInt();
            double amt = 0;

            if (units <= 50) {
                amt = units * 3;
            } else if (units <= 200) {
                amt = 50 * 3 + (units - 50) * 4.80;
            } else if (units <= 400) {
                amt = 50 * 3 + 150 * 4.80 + (units - 200) * 5.80;
            } else {
                amt = 50 * 3 + 150 * 4.80 + 200 * 5.80 + (units - 400) * 6.20;
            }

            System.out.print("Do you want to pay online(y/n): ");
            char choice = sc.next().charAt(0);

            double disc = 0;
            double amtFinal = amt;

            if (choice == 'y' || choice == 'Y') {
                disc = amt * 0.03;
                amtFinal = amt - disc;
            } else {
                disc = 0;
                amtFinal = amt;
            }

            System.out.println("Total amount: " + amt);
            System.out.println("Discount: " + disc);
            System.out.println("Amount payable: " + amtFinal);
            sc.close();
        }
    }