package gpt.task;

import java.util.*;

public class CheckingAnagrams {
    public static void main(String[] args) {
        CheckingAnagrams check = new CheckingAnagrams();
        String str1 = "listen";
        String str2 = "silent";

        check.areAnagrams(str1, str2);
        if (check.areAnagrams(str1, str2)) System.out.println(str1 + " and " + str2 + " are anagrams!");
         else System.out.println(str1 + " and " + str2 + " aren't anagrams!");
    }

    boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}