public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(0);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long rounded;
        if (kilometersPerHour < 0) {
            return -1;
        }
        double result = Math.round(kilometersPerHour / 1.609);
        return (long) result;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
