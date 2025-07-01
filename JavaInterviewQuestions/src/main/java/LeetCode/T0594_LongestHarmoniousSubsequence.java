package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class T0594_LongestHarmoniousSubsequence {
    public static int bestLHS(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int longest;
        for (int key : map.keySet()) {
            if(map.containsKey(key + 1)) {
                longest = map.get(key) + map.get(key + 1);
                if(longest > answer) answer = longest;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] test1 = {1,3,2,2,5,2,3,7};
        int[] test2 = {1,2,3,4};
        int[] test3 = {1,1,1,1};

        System.out.println(bestLHS(test1));
        System.out.println(bestLHS(test2));
        System.out.println(bestLHS(test3));
    }
}
