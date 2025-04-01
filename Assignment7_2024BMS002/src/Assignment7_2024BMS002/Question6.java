package Assignment7_2024BMS002;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        for (int i = 0; i < s.length(); i++) {
            char c = toLowerCase(s.charAt(i));
            if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u')
            map.put(c,map.getOrDefault(c,0)+1);
        }
        try {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 0) {
                    throw new Exception();
                }
            }
        }
        catch (Exception e) {
            System.out.println("All vowels are not present");
        }

    }
}
