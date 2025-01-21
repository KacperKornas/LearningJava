package Chapter3;//Change small letters to big one and big letter to small, use ASCII code.

import java.io.IOException;

public class Test3E10 {

    public static void main(String[] args) throws IOException {

        int counter = 0;
        char character, ignore;

        do {
            System.out.print("Enter small or big alphabet letter or dot if you want to quit: ");
            character = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (character >= 97 && character <= 122) {
                character -= 32;
                System.out.println(character);
                counter++;
            } else if (character >= 65 && character <= 90) {
                character += 32;
                System.out.println(character);
                counter++;
            } else System.out.println(character);

        } while (character != '.');
        System.out.println(counter + " letters were changed.");
    }
}
