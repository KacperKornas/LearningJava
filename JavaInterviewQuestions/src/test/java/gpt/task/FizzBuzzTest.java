package gpt.task;

import codility.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzzTest() {
        FizzBuzz fizzB = new FizzBuzz();
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, fizzB.fizzBuzz(15));
    }
}
