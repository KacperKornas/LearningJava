package gpt.task;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciCode {
    public static void main(String[] args) {
        FibonacciCode f = new FibonacciCode();

        System.out.println("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        f.fibonacci(n);
    }

    public void fibonacci(int number) {
        ArrayList<Integer> storage = new ArrayList<>();

        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }

        if (number >= 0) storage.add(0);
        if (number >= 2) storage.add(1);

        for (int i = 2; i < number; i++) {

        int next = storage.get(i - 1) +  storage.get(i - 2);
        storage.add(next);

        }
        System.out.println(storage);
    }
}


