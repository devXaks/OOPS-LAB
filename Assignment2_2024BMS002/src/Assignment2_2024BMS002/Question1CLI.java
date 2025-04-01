    package Assignment2_2024BMS002;

    public class Question1CLI {
        public static void main(String[] args) {
            //programmmed by 2024BMS002;
            //data1 is the dividend
            //data2 in the divisor
            int data1 = Integer.parseInt(args[0]);
            int data2 = Integer.parseInt(args[1]);
            int quotient = data1 / data2;
            int remainder = data1 % data2;
            System.out.println("The quotient is " + quotient );
            System.out.println("The remainder is " + remainder);


        }
    }
