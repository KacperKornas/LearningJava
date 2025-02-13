package gpt_task;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ListCreator {

    String text;
    ArrayList<Integer> numbers = new ArrayList<>();

    public void enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me numbers separated by ' '.");
        text = scanner.nextLine();
    }

    public void listCreator() {
        String[] str = text.split(" ");

        for (String s : str) {
            try {
            numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException e ) {
                System.out.println("Invalid value omitted: '" + s + "'");
            }
        }

        System.out.print("Created list: ");
    }

    public void showList() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void sortNumbers() {
        numbers.sort(null);
        System.out.print("Sorted list: ");
        showList();
    }

    public void deleteDuplicate() {
        numbers = new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.print("Unique list: ");
        showList();
    }

    public void sum() {
        int sum = 0;
        double average;

        for (int number : numbers) {
            sum += number;
        }

        average = (double) sum / numbers.size();

        System.out.println("Sum: " + sum + "\nAverage: " + average);
    }

    
    public static void main(String[] args) {
        ListCreator list = new ListCreator();
        list.enterNumbers();
        list.listCreator();
        list.showList();
        list.sortNumbers();
        list.deleteDuplicate();
        list.sum();
    }
}
