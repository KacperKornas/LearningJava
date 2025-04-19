package gpt.task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertingToRomanNumeralsTest {

    @Test
    void testIntToRoman() {
        ConvertingToRomanNumerals converter = new ConvertingToRomanNumerals();
        assertEquals("I", converter.intToRoman(1));
        assertEquals("IV", converter.intToRoman(4));
        assertEquals("IX", converter.intToRoman(9));
        assertEquals("XL", converter.intToRoman(40));
        assertEquals("XC", converter.intToRoman(90));
        assertEquals("CD", converter.intToRoman(400));
        assertEquals("MCMXCIV", converter.intToRoman(1994));
        assertEquals("MMXXIV", converter.intToRoman(2024));
        assertEquals("MMMCMXCIX", converter.intToRoman(3999));
    }
}
