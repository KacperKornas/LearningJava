package LeetCode;

import java.util.Arrays;

public class T0238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int[] products = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            products[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            products[i] *= suffix;
            suffix *= nums[i];
        }
        return products;
    }
}
