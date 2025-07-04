package leetCode;

import java.util.HashSet;

public class T0217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums) {
            if (seen.contains(num)) return true;

            seen.add(num);
        }
        return false;
    }
}
