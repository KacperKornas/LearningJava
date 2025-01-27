package Chapter6;

public class Test6E3 {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(2);
        stack.push(5);
//        stack.push(8);
//        System.out.println(stack.top);

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
        top = -1;
    }

    void  push(int value) {
        if(top > arr.length - 1) {
            System.out.println("Stack overflow!");
        } else {
            top++;
            arr[top] = value;
        }
    }
//    void pop() {
//        arr -= arr[arr.length-1];
//    }
}