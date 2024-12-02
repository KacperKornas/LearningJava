public class TheForStatementChallengeExercise {

    public static void main(String[] args) {

//        primeCounter(1,10);
//        primeCounter(25,100);
        primeCounter(1,1000);
    }

    
    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }


    public static void primeCounter(int valueStart, int end) {

        int primeNumberCounter = 0;

        for (int start = valueStart; start <= end; start++) {
            if (isPrime(start)) {
                primeNumberCounter++;
                System.out.println("Founded prime number = " + start + " Amount of finding prime numbers = " + primeNumberCounter);
                if (primeNumberCounter == 3) {
                    break;
                }
            }
        }
    }
}

