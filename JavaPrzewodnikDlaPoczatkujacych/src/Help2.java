import java.io.IOException;

public class Help2 {
    public static void main(String[] args) throws IOException {

        char choice, ignore;

        do {
            System.out.print("""
                    Informacja o składni instrukcji:\s
                    \t1. if\s
                    \t2. switch\s
                    \t3. for\s
                    \t4. while\s
                    \t5. do-while\s
                    Wybierz numer instrukcji:\s""");

            choice = (char) System.in.read();
            System.out.println("\n");

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            } while (choice < '1' | choice > '5');

            switch (choice) {
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
                case '3':
                    System.out.println("Pętla for:\n");
                    System.out.println("for(inicjalizacja; warunek; iteracja)");
                    System.out.println(" instrukcja;");
                    break;
                case '4':
                    System.out.println("Pętla while:\n");
                    System.out.println("while(warunek instrukcja;");
                    break;
                case '5':
                    System.out.println("Pętla do-while:\n");
                    System.out.println("do {");
                    System.out.println(" instrukcja;");
                    System.out.println("} while (warunek);");
                    break;
            }

        }
    }
