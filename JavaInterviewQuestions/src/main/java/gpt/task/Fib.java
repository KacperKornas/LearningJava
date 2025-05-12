package gpt.task;

import java.util.ArrayList;
import java.util.List;

public class Fib {

    public static List<Integer> fibonacci(int n) {
        List<Integer> fib = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            fib.add(i < 2 ? i : fib.get(i - 1) + fib.get(i - 2));
        }
        return  fib;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(14));
    }
}