package gpt.task;

public class CountingCharString {
    public static void main(String[] args) {
        CountingChar counter = new CountingChar();

        System.out.println(counter.counting("Ala ma kota", 'a'));
    }
}

class CountingChar {

    int counting(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) counter++;
        }
        return counter;
    }
}


