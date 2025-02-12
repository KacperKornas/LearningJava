package gpt_task;

import java.util.Scanner;

public class ListCreator {

    public void enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me numbers separated by ' '.");
        String text = scanner.nextLine();
    }




    public static void main(String[] args) {
        ListCreator list = new ListCreator();
        list.enterNumbers();
    }
}
