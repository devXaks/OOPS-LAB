package Assignment7_2024BMS002;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Question3 {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\mailt\\Desktop\\OOPS_Lab\\Assignment7_2024BMS002\\src\\Assignment7_2024BMS002\\first.txt";
        try(Scanner sc = new Scanner(new File(filepath))){
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }

    }
}
