package Assignment2_2024BMS002;

public class Question5CLI {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        int val3 = Integer.parseInt(args[2]);
        int minval = Math.min(val1, Math.min(val2, val3));
        int maxval = Math.max(val1, Math.max(val2, val3));
        int midval = val1 + val2 + val3 -minval - maxval;
        System.out.println("The values in ascending order are: " + minval + " -> " + midval + " -> " + maxval);

    }
}
