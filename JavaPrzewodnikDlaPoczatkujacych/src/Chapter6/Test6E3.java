package Chapter6;

public class Test6E3 {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(10);

        stack.showStack();

        stack.push(10);
        stack.pop();
        stack.pop();

        stack.showStack();

        stack.pop();
        stack.pop();
        stack.pop();
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
        if(top >= arr.length - 1) {
            System.out.println("Stack overflow!");
        } else {
            top++;
            arr[top] = value;
        }
    }
    void pop() {
        if(top <= -1) {
            System.out.println("Stack is empty");
        } else {
            arr[top] -= 0;
            top--;
        }
    }

    void showStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}