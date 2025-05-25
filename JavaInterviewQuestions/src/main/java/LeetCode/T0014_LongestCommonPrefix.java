package LeetCode;

public class T0014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder respond = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return respond.toString();
                }
            }
            respond.append(strs[0].charAt(i));
        }
        return respond.toString();
    }
}
