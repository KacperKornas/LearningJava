public class EqualityPrinter {
    public static void main(String[] args) {
//        System.out.println(printEqual(1,1,1));
//        System.out.println(printEqual(1,1,2));
//        System.out.println(printEqual(-1,-1,-1));
//        System.out.println(printEqual(1,2,3));
    }

    public static void printEqual(int first, int second, int third) {
        if(first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        } else if ((first == second) && (second == third)) {
            System.out.println("All numbers are equal");
        } else if ((first != second) && (first != third) && (third != second)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
