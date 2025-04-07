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

        Set<Character> sList1 = new TreeSet<Character>();
        Set<Character> sList2 = new TreeSet<Character>();

        for (int i = 0; i <= str1.length() - 1; i++) {
            sList1.add(str1.charAt(i));
        }

        for (int i = 0; i <= str2.length() - 1; i++) {
            sList2.add(str2.charAt(i));
        }

        return sList1.equals(sList2);
    }
}