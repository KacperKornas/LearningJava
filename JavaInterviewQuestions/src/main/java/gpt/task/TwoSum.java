package gpt.task;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int target = 15;

        TwoSum twoSum = new TwoSum();
        int[] ans = twoSum.twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
}
