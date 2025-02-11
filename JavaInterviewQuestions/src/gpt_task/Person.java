package gpt_task;

class FirstTask {
    public static void main(String[] args) {
        Person first = new Person("Adam", 15);
        Person second = new Person("Mia", 25);
        Person third = new Person("Michael", 18);
        Person fourth = new Person("Michael", 18);

        System.out.println(first.getName() + " is adult? " + first.isAdult());
        System.out.println(second.getName() + " is adult? " + second.isAdult());
        System.out.println(third.getName() + " is adult? " + third.isAdult());
        System.out.println(fourth.getName() + " is adult? " + fourth.isAdult());

        first.setName("Max");
        System.out.println("New name: " + first.getName());
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
