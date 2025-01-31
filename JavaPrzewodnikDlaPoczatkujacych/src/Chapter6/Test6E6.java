package Chapter6;

public class Test6E6 {
    public static void main(String[] args) {
        Test6E6 test = new Test6E6();

        test.showBackWard("Show me everything.", 0);
    }

    void showBackWard(String str, int index) {
        if (index == str.length())
            return;

        showBackWard(str, index + 1);

        System.out.print(str.charAt(str.length() - index - 1));
    }
}
