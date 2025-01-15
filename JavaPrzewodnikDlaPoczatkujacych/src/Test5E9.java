public class Test5E9 {
    public static void main(String[] args) {
        int x = -5, y;

        if(x < 0) y = 10;
        else y = 20;

        System.out.println(y);

        y = x < 0 ? 10 : 20;

        System.out.println(y);
    }
}
