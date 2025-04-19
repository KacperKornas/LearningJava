package from.nowhere;

public class PersonClass {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(35);
        person.setName("Adam");
        person.setSurname("Kowalik");

        person.display();
    }
}

class Person {
    private int age;
    private String name;
    private String surname;

    void setAge(int a) {
        age = a;
    }

    void setName(String n) {
        name = n;
    }

    void setSurname(String s) {
        surname = s;
    }

    void display() {
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }
}
