public class ReversingString {
    public static void main(String[] args) {
        String text = "Hello, World!";
        System.out.println(reverseString(text));
    }

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
}
