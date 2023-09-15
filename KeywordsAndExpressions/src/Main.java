public class Main {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 5000;
        int levelComleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else if (score > 5000) {
            System.out.println("Your score is higher than 5000");
        } else {
            System.out.println("Your score is under 5000");
        }
    }
}
