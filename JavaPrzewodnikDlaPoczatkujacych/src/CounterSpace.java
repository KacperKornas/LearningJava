import java.io.IOException;

public class CounterSpace {
    public static void main(String[] args) throws IOException {

        char character;
        char ignore;
        int counter = 0;

        do {
            System.out.print("Enter the sign: ");
            character = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (character == ' ') {
                counter++;
            }
        } while (character != '.');

        System.out.println("Number of entered spacebar: " + counter);
    }
}
