public class TheWhileLoopChallenge {


    public static void main(String[] args) {

        int start = 4;
        int end = 20;
        int allEvenNumbers = 0;
        int allOddNumbers = 0;

        while (start <= end) {
            start++;
            if (!isEvenNumber(start)) {
                allOddNumbers++;
                continue;
            }
            allEvenNumbers++;
            System.out.println(start + " is even number");
            if (allEvenNumbers == 5) {
                break;
            }
        }
        System.out.println("Total founded even numbers = " + allEvenNumbers);
        System.out.println("Total founded odd numbers = " + allEvenNumbers);
    }


    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
