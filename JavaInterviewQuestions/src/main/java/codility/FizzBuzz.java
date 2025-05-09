package codility;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> sList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                sList.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                sList.add("Fizz");
            }
            else if (i % 5 == 0) {
                sList.add("Buzz");
            }
            else {
                sList.add(Integer.toString(i));
            }
        }
        return sList;
    }

    public static void main(String[] args) {
        FizzBuzz fZ = new FizzBuzz();
        System.out.print(fZ.fizzBuzz(10000));
    }
}
