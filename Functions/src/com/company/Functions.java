package com.company;

public class Functions {

    public static void main(String[] args) {
        calculateScore(true, 100, 120);
    }

    public static void calculateScore(boolean gameOver, int score, int bonus) {
        if(gameOver) {
            int finalScore = score + bonus;
            System.out.println(finalScore);
        } else {
            System.out.println("Game not over!");
        }
    }
}
