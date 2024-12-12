import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        System.out.print("Informacja o składni instrukcji: \n\t1. if \n\t2. switch \nWybierz numer instrukcji: ");
        char choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("Instrukcja warunkowa if:\n\nif(warunek) instrukcja;\nelse instrukcja;");
                break;
            case '2':
                System.out.println("Instrukcja wyboru switch (tradycyjna):\n");
                System.out.println("switch(wyrażenie) {");
                System.out.println("  case stała:");
                System.out.println("    sekwencja instrukcji");
                System.out.println("    break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Nieprawidłowy wybór");
        }

    }
}
