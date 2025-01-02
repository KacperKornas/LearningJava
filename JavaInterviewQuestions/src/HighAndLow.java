import java.util.LinkedList;
import java.util.Random;

public class HighAndLow {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor(-100, 800);
        processor.generateNumbers();
        processor.findMinAndMax();
        processor.printNumbers();
        processor.printResults();
    }
}

    class NumberProcessor {
        private final LinkedList<Integer> numbers;
        private final Random generator;
        private int min;
        private int max;
        private final int lowerBound;
        private final int upperBound;

        public NumberProcessor(int lowerBound, int upperBound) {
            this.numbers = new LinkedList<>();
            this.generator = new Random();
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.min = Integer.MAX_VALUE;
            this.max = Integer.MIN_VALUE;
        }

        public void generateNumbers() {
            for (int i = 0; i < 50; i++) {
                numbers.add(generator.nextInt(upperBound - lowerBound + 1) + lowerBound);
            }
        }

        public void findMinAndMax() {
            for (int number : numbers) {
                if (number < min) min = number;
                if (number > max) max = number;
            }
        }

        public void printNumbers() {
            System.out.println("Generated Numbers:");
            for (int number : numbers) {
                System.out.println(number);
            }
        }

        public void printResults() {
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
    }
