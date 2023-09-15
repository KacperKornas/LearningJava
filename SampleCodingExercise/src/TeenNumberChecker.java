public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(14, 14, 14));
        System.out.println(isTeen(77));
    }

    public static boolean hasTeen(int first, int second, int third) {
        if ((first >= 13) && (first <= 19)) {
            return true;
        } else if ((second >= 13) && (second <= 19)) {
            return true;
        } else if ((third >= 13) && (third <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int first){
        if ((first >= 13) && (first <= 19)) {
            return true;
        }return false;
    }
}
