package Assignment6_2024BMS002;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {20,20,30,40,50,50,50};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] arr1 = new int[map.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr1[index] = entry.getKey();
            index++;
        }
        System.out.println(arr1.length);
    }
}
