package internet;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
        System.out.println(Arrays.toString(twoSum(numbers, 26)));
    }
}
