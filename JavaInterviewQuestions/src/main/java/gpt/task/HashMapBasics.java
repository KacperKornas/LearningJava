package gpt.task;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class HashMapBasics {
    HashMap<Integer, String> names = new HashMap<>();

    public void addName(String name) {
        try {
            if (name == null) {
                throw new NullPointerException("Name cannot be null.");
            }
            names.put(names.size() + 1, name);
        } catch (NullPointerException e) {
            System.out.println("Cannot add null as a key or value: " + e.getMessage());
        }
    }

    public void updateName(int key, String name) {
        try {
            if (!names.containsKey(key)) {
                throw new NoSuchElementException("Key " + key + " does not exist.");
            }
            names.put(key, name);
        } catch (NoSuchElementException e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }

    public void removeName(int key) {
        try {
            if (!names.containsKey(key)) {
                throw new NoSuchElementException("Key " + key + " does not exist.");
            }
            names.remove(key);
        } catch (NoSuchElementException e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }

    public void showNames() {
        if (names.isEmpty()) {
            System.out.println("No names in the list.");
            return;
        }
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashMapBasics nMap = new HashMapBasics();


        nMap.showNames();

        nMap.addName("Lily");
        nMap.addName("Jack");
        nMap.addName("James");

        nMap.showNames();

        nMap.updateName(2, "Alice");
        nMap.updateName(4, "Alice");

        nMap.showNames();

        nMap.removeName(3);
        nMap.removeName(3);

        nMap.showNames();
    }
}
