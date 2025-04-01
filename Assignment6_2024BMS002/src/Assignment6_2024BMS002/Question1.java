package Assignment6_2024BMS002;

//programmed by 2024BMS002;
import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 7};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Duplicate elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
