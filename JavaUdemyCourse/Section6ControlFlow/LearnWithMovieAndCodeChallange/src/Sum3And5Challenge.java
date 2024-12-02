public class Sum3And5Challenge {

    public static void main(String[] args) {

        int sumOfNumbersDivisibleBy3And5 = 0;
        int foundedNumber = 0;
        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                sumOfNumbersDivisibleBy3And5 += i;
                foundedNumber++;
                System.out.println("Number dividing by 3 and five is " + i + ".");
                if (foundedNumber == 5){
                    break;
                }
            }
        }
        System.out.println("Sum = " + sumOfNumbersDivisibleBy3And5);
    }

}
