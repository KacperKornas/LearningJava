package leetCode;

import java.util.ArrayList;

public class T0268_MissingNumber {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int missing = nums.length;

        for(int i = 0; i < numbers.size(); i++) {
            if(!numbers.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }
}
