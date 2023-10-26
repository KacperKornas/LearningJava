public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println(startingIndex);
        System.out.println(birthDate.substring(startingIndex));
    }
}
