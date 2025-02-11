package gpt_task;

class Try {
    public static void main(String[] args) {
        Person first = new Person("Adam", 15);
        Person second = new Person("Mia", 25);
        Person third = new Person("Michael", 18);
        Person fourth = new Person("Michael", 18);

        System.out.println(first.isAdult());
        System.out.println(second.isAdult());
        System.out.println(third.isAdult());
        System.out.println(fourth.isAdult());

        System.out.println(first.getName());
        System.out.println(second.getName());
        first.setName("Kapeć");
        second.setName("Max");
        System.out.println(first.getName());
        System.out.println(second.getName());

    }
}

public class Person {
    private String name;
     private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
