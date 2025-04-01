package Assignment7_2024BMS002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        String fpath = "C:\\Users\\mailt\\Desktop\\OOPS_Lab\\Assignment7_2024BMS002\\src\\Assignment7_2024BMS002\\second.txt";
        try(Scanner sc = new Scanner(new File(fpath))){
            while(sc.hasNext()){
                int num  = sc.nextInt();
                if(num>0){
                    throw new RuntimeException("Positive Number");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(RuntimeException r1){
            System.out.println("Positive Number found");
        }

    }
}
