package Assignment7_2024BMS002;

public class Question1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Zero division error");
        }
        finally{
            System.out.println("Exception block executed");
        }
    }
}
