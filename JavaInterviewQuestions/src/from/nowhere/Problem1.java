package from.nowhere;//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

public class Problem1 {
    public static void main(String[] args) {
    int [] numbers = {10, 15, 3, 7};
    int k = 17;

    for(int i = 0; i < numbers.length; i++) {
        for(int j = numbers.length -1; j > i; j--) {
            if (numbers[i] + numbers[j] == k) {
                System.out.println(numbers[i] + " + " + numbers[j] + " = " + k);
            }
        }
    }

    }
}
