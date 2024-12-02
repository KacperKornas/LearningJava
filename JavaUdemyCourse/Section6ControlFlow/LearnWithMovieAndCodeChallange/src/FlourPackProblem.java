public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(4, 3, 22));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int totalBigCount = bigCount * 5;

        if (totalBigCount > goal) {
            return (smallCount >= (goal % 5));
        } else {
            return bigCount * 5 + smallCount >= goal;
        }
    }
}