package gpt.task;

public class ConvertingToRomanNumerals {
    public static void main(String[] args) {
        ConvertingToRomanNumerals nNumber = new ConvertingToRomanNumerals();
        int year = 1994;
        System.out.println(year);
        String rYear = nNumber.intToRoman(year);
        System.out.println(rYear);
    }

    public String intToRoman(int number) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }
}
