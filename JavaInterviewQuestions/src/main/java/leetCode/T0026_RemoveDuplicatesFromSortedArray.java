package leetCode;

public class T0026_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
