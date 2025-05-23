package LeetCode;

public class T0070_ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 2) return n;

        int first = 1;
        int second = 2;

        for(int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
