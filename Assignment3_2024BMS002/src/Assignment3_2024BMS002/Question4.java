package Assignment3_2024BMS002;

import java.util.Random;
import java.util.Scanner;

public class Question4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int computerGuess = random.nextInt(1,10);
            System.out.print("Enter user number : ");
            int userGuess = scanner.nextInt();
            System.out.println("Computer guesses: " + computerGuess);

            if (userGuess == computerGuess) {
                System.out.println("You got it right");
            } else if (Math.abs(userGuess - computerGuess) == 1) {
                System.out.println("Almost got it");
            } else {
                System.out.println("You got it wrong");
            }
            scanner.close();
        }
    }
