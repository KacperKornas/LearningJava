package LeetCode;

public class T0387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {

        boolean isUnique = true;
        int answer = -1;

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < s.length(); j++) {
                if(i == j) continue;
                else if(s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) return answer = i;
            isUnique = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        T0387_FirstUniqueCharacterInAString uniq = new T0387_FirstUniqueCharacterInAString();
        System.out.println(uniq.firstUniqChar("loveleetcode"));;
    }
}
