package Assignment7_2024BMS002;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        try{
            for(int i = 0; i < size; i++){
                for(int j = i+1; j < size; j++){
                    if(array[i] == array[j]){
                        throw new Exception("Duplicate");
                    }
                }
            }

        }
        catch(Exception e){
            System.out.println("Duplicate element found ");
        }
        finally{
            System.out.println("Program executed successfully");
        }
    }
}
