package LeetCode;

public class T0191_NumberOf1Bits {
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        int hammingWeight = 0;
        for(int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
                hammingWeight++;
            }
        }
        return hammingWeight;
    }
}
