package Chapter3;

import java.io.IOException;

public class Help3 {
    public static void main(String[] args) throws IOException {

        for (;;) {
            char choice;

            do {
                System.out.print("""
                        \n Informacja na temat składni instrukcji:
                        \t1. if
                        \t2. switch
                        \t3. for
                        \t4. while
                        \t5. do-while
                        \t6. break
                        \t7. continue
                        Wybierz numer instrukcji (lub 'q', aby zakończyć): """);

                choice = (char) System.in.read();
                System.out.println();

                while (System.in.read() != '\n');
            } while ((choice < '1' || choice > '7') && choice != 'q');

            if (choice == 'q') {
                System.out.println("Koniec programu.");
                break;
            }

            switch (choice) {
                case '1':
                    System.out.println("""
                            Instrukcja warunkowa if:
                            if (warunek) instrukcja;
                            else instrukcja;""");
                    break;
                case '2':
                    System.out.println("""
                            Instrukcja wyboru switch (tradycyjna):
                            switch (wyrażenie) {
                              case stała:
                                sekwencja instrukcji;
                                break;
                              // ...
                            }""");
                    break;
                case '3':
                    System.out.println("""
                            Pętla for:
                            for (inicjalizacja; warunek; iteracja)
                                instrukcja;""");
                    break;
                case '4':
                    System.out.println("""
                            Pętla while:
                            while (warunek)
                                instrukcja;""");
                    break;
                case '5':
                    System.out.println("""
                            Pętla do-while:
                            do {
                                instrukcja;
                            } while (warunek);""");
                    break;
                case '6':
                    System.out.println("""
                            Instrukcja break:
                            break; lub break etykieta;
                            """);
                    break;
                case '7':
                    System.out.println("""
                            Instrukcja continue:
                            continue; lub continue etykieta;
                            """);
                    break;
            }
        }
    }
}
