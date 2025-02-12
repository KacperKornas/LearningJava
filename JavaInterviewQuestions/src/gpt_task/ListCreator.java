package gpt_task;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCreator {

    String text;
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public void enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me numbers separated by ' '.");
        text = scanner.nextLine();
    }

    public void listCreator() {
        int a;
        for (int i = 0; i < text.length(); i += 2) {
            a = text.charAt(i);
            numbers.add(a);
        }
    }

    public void showList() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }




    public static void main(String[] args) {
        ListCreator list = new ListCreator();
        list.enterNumbers();
        list.listCreator();
        list.showList();
    }
}
