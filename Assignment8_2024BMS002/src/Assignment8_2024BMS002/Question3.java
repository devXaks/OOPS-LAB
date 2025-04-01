package Assignment8_2024BMS002;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = null;
        try {
            System.out.println(arr[0]);
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer exception caught");
        }
    }
}
