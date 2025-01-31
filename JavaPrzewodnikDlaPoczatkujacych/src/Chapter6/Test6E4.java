package Chapter6;

public class Test6E4 {
    public static void main(String[] args) {
        Test a = new Test(7);
        Test b = new Test(2);

        System.out.println(a.a);
        System.out.println(b.a);
        a.swap(a,b);
        System.out.println(a.a);
        System.out.println(b.a);
    }
}

class Test {
    int a;
    Test(int i) { a = i; }

    void swap(Test obj1, Test obj2) {
        Test change = new Test(0);
        change.a = obj1.a;
        obj1.a = obj2.a;
        obj2.a = change.a;
    }
}
