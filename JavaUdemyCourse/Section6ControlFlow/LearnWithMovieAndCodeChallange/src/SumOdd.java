public class SumOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(77));
        System.out.println(sumOdd(1,100));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } if (number % 2 == 1){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if ((start < 0) || (end < 0) || (end < start)){
            return -1;
        }
        int sumOfOdd = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sumOfOdd += i;
            }
        }
        return sumOfOdd;
    }
}
