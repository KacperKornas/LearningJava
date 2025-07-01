package leetCode;

public class T0191_NumberOf1Bits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int hammingWeight = 0;

        for(int i = 0; i <= n; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            for(int j = 0; j < binaryNumber.length(); j++) {
                if(binaryNumber.charAt(j) == '1') {
                    hammingWeight++;
                }
            }
            ans[i] = hammingWeight;
            hammingWeight = 0;
        }
        return ans;
    }
}
