package Chapter6;

public class Test6E6 {
    public static void main(String[] args) {
        Test6E6 test = new Test6E6();

        test.showBackWard("Show me everything.");
    }

    void showBackWard(String str) {
        if (str.isEmpty())
            return;

        showBackWard(str.substring(1));
        System.out.print(str.charAt(0));
    }
}
