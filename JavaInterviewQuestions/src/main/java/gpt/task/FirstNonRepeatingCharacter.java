package gpt.task;

public class FirstNonRepeatingCharacter {

    static char findNonRepeat (String str) {

        for (int i = 0; i <= str.length() - 1; i++) {
            int counter = 0;
            char ch = str.charAt(i);

            for (int j = 0; j <= str.length() - 1; j++) {
                if (i != j && ch == str.charAt(j)) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) return ch;
        }
        return ' ';
    }

    public static void main (String[] args) {
        String str = "aabbcd";
        System.out.println(findNonRepeat(str));
    }
}
