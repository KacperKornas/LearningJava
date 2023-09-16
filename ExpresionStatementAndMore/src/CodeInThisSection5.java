public class CodeInThisSection5 {
    public static void main(String[] args) {

        calculateScore(40, 100);
        calculateScore("Dennis", 500);
    }
    public static void calculateScore(String playerName, int score) {
        System.out.println(playerName + " has " + score + " points!");
    }
    public static void calculateScore(int hp, int score) {
        System.out.println(hp + "hp gave " + score + " points!");
    }
}
