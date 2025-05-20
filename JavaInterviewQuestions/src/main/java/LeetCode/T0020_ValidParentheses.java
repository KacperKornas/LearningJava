package LeetCode;

public class T0020_ValidParentheses {

        public boolean isValid(String s) {
            StringBuilder half = new StringBuilder("");
            String secondHalf = "";

            for(int i = 0; i <= s.length() / 2; i++) {
                secondHalf += s.charAt(i);
            }

            for(int i = 0; i <= s.length(); i++) {
                half.append(i);
            }

            for(int i = half.length() / 2; i <= half.length() - 1; i++) {
                if (half.charAt(i) == ')') {
                    half.setCharAt(i, '(');
                } else if (half.charAt(i) == '}') {
                    half.setCharAt(i, '{');
                } else if (half.charAt(i) == ']') {
                    half.setCharAt(i, '[');
                }
            }
            System.out.println(half);
            System.out.println(secondHalf);
            return secondHalf.equals(half);
        }
    public static void main(String[] args) {
        T0020_ValidParentheses obj = new T0020_ValidParentheses();
        obj.isValid("()[]{}");
    }
    }

