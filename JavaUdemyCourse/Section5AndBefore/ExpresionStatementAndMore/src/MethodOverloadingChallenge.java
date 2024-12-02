public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(2));
        System.out.println(convertToCentimeters(10));
        System.out.println(convertToCentimeters(1,2));
        System.out.println(convertToCentimeters(2,2));
        System.out.println(convertToCentimeters(10,2));

    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return convertToCentimeters(heightInFeet * 12 + heightInInches);

    }
}

