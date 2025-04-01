package Assignment6_2024BMS002;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {


        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        if (nums == null || nums.length == 0) {
            System.out.println("Length of the longest consecutive elements sequence: 0");
            return;
        }

        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else if (nums[i] != nums[i - 1]) {
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }

        longestStreak = Math.max(longestStreak, currentStreak);
        System.out.println("Length of the longest consecutive elements sequence: " + longestStreak);

    }
}
