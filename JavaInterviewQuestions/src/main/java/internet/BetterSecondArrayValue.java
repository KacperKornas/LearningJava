package internet;

public class BetterSecondArrayValue {
    public static void main(String[] args) {
        CreateArrays odd = new CreateArrays(50, 1, 2);
        CreateArrays even = new CreateArrays(50, 2, 2);

        System.out.println("Odd array: ");
        odd.printEveryOtherElement();

        System.out.println();

        System.out.println("Even array: ");
        even.printEveryOtherElement();
    }
}

class CreateArrays {
    int[] numbers;

    public CreateArrays(int size, int startValue, int increment) {
        numbers = new int[size];
        fillArray(startValue, increment);
    }

    void fillArray(int startValue, int increment) {
        int value = startValue;
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = value;
            value += increment;
        }
    }

    void printEveryOtherElement() {
        for(int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}


