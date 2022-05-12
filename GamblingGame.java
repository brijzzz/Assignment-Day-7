package com.bridgelabz.GamblingGame;

public class GamblingGame {
    void startGame() {

        int totalWonAndLost = 0;

        for (int day = 1; day <= 20; day++) {

            int amt = 100;

            while (amt < 150 && amt > 50) {

                int won_Lost = (int) ((Math.random()) * 10) % 2;

                if (won_Lost == 1) {

                    amt = amt + 1;
                    totalWonAndLost = totalWonAndLost + 1;

                }
                else {

                    amt = amt - 1;
                    totalWonAndLost = totalWonAndLost - 1;

                }

            }
            System.out.println("Money available on day "+day+ " : " +amt);
        }
        System.out.println("Total won or lost amt: " +totalWonAndLost);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to gambling game program");
        GamblingGame game = new GamblingGame();
        game.startGame();

    }
}
