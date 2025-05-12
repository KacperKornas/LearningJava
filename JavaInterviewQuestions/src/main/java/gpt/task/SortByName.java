package gpt.task;

import java.util.TreeSet;

public class SortByName {

    TreeSet sort(String[] array) {
        TreeSet sortNames = new TreeSet();
        for (String n : array) {
            sortNames.add(n);
        }
        return sortNames;
    }

    public static void main(String[] args) {
        String[] names = {"William", "Oliver", "Elizabeth", "James"};
        SortByName nList = new SortByName();
        System.out.println(nList.sort(names));
    }
}
