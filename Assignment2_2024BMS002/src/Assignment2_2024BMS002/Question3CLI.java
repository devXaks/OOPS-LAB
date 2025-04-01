package Assignment2_2024BMS002;

import java.util.Random;

public class Question3CLI {
    public static void main(String[] args) {
        //programmed by 2024BMS002
        Random rand = new Random();
        int randomNum1 = rand.nextInt(1,7);
        int randomNum2 = rand.nextInt(1,7   );
        System.out.println("randomNum1: " + randomNum1 + ", randomNum2: " + randomNum2);
        System.out.println("Sum of random numbers is : "+ (randomNum1+randomNum2));
    }
}
