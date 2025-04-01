    package Assignment2_2024BMS002;

    import java.util.Scanner;

    public class Question7 {
        public static void main(String[] args) {
            //programmed by 2024BMS002
            int cnt = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println("a  b  pow(a, b)");
            for (; cnt <= 5; a++, b++,cnt++) {
                int result = (int) Math.pow(a, b);
                System.out.println(a + "  " + b + "  " + result);
                sc.close();

            }

        }
    }