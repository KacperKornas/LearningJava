public class InchToMeter {
    public static void main(String[] args) {
        double meter;
        int counter = 0;

        for (double inch = 1; inch <= 144; inch++) {
            meter = inch * 39.37;
            System.out.println(inch + " inches is " + meter + "meters.");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
