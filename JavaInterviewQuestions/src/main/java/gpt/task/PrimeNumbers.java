package gpt.task;

import java.util.ArrayList;

public class PrimeNumbers {

    public static ArrayList<Integer> nPrimeNumbers (int n) {
        int max = Integer.MAX_VALUE;
        if (n < 2) return null;

        boolean status;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);

        for (int i = 3; i < max; i++) {
            status = false;
            if (primeNumbers.size() == n) {
                break;
            }

            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    status = true;
                    break;
                }
            }
            if (!status) primeNumbers.add(i);
        }
        return primeNumbers;
    }

    public static void showPrimeNumbers(int n) {
        ArrayList<Integer> showPrime = nPrimeNumbers(n);
        System.out.println(showPrime);
    }

    public static void main (String[] args) {
        showPrimeNumbers(-1);
        showPrimeNumbers(5);
        showPrimeNumbers(20);
        showPrimeNumbers(100);
        showPrimeNumbers(1000);
    }
}
