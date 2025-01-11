package CodeForces.ALightsOut;

import java.util.Scanner;

public class ALightsOut {
    public static void lightOut(){
        int[][] lights = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        Scanner scann = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (scann.nextInt() % 2 == 1) {
                    lights[i][j] = 1 - lights[i][j];
                    switchAdjacent(i, j, lights);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(lights[i][j]);
            }
        }
    }
    private static void switchAdjacent(int x, int y, int[][] lights) {
        int[][] directions = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        for (int[] direction : directions) {
            int newX = x + direction[0];
            int newY = y + direction[1];
            if (newX >= 0 && newX < 3 && newY >= 0 && newY < 3) {
                lights[newX][newY] = 1 - lights[newX][newY];
            }
        }
    }
}
