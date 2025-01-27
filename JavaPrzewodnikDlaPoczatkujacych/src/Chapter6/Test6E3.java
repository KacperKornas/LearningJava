package Chapter6;

public class Test6E3 {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        for (int i : stack.arr) {
            System.out.println(stack.arr[i]);
        }

    }
}

class Stack {
    int[] arr;
    int top;

    public Stack(int size) {
        arr = new int[size];
        top = - 1;
    }

//    void pop() {
//        arr -= arr[arr.length-1];
//    }
}