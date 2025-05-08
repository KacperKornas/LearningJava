package codility;

public class MissingInteger {
    public int findMissingInt(int[] A) {
        int n = A.length;
        boolean[] seen = new boolean[n + 1];

        for (int number : A) {
            if (number >= 1 && number <= n) {
                seen[number] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) return i;
        }
        return n + 1;
    }
}
