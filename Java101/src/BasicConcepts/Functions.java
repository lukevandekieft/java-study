package BasicConcepts;

public class Functions {

    public static void main(String[] args) {
        calculateScore(true, 100, 120);
        System.out.println("Function return result: " + calculateAndReturnScore(true, 300, 60));
        System.out.println("Overloaded function result: " + calculateAndReturnScore(true, 300));
    }

    // void = no return value
    public static void calculateScore(boolean gameOver, int score, int bonus) {
        if(gameOver) {
            int finalScore = score + bonus;
            System.out.println("Printed call score: " + finalScore);
        } else {
            System.out.println("Game is not over!");
        }
    }

    // int = return value int
    public static int calculateAndReturnScore(boolean gameOver, int score, int bonus) {
        if(gameOver) {
            return score + bonus;
        } else {
            return -1;
        }
    }

    public static int calculateAndReturnScore(boolean gameOver, int score) {
        if(gameOver) {
            return score;
        } else {
            return -1;
        }
    }
}
