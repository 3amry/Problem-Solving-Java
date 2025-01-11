package CodeForces.ALightsOut;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        lightOut();
    }

    public static void lightOut() {
        int[][] lights = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        Scanner scann = new Scanner(System.in);

        // Read input and toggle the lights accordingly
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (scann.nextInt() % 2 == 1) {
                    lights[i][j] = 1 - lights[i][j];
                    switchAdjacent(i, j, lights);
                }
            }
        }

        // Output the final grid state
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(lights[i][j]);
            }
            System.out.println();  // New line after each row
        }

        scann.close();  // Close the scanner
    }

    // Helper function to toggle adjacent cells
    private static void switchAdjacent(int x, int y, int[][] lights) {
        int[][] directions = {
                {0, 1},   // Right
                {0, -1},  // Left
                {1, 0},   // Down
                {-1, 0}   // Up
        };

        for (int[] direction : directions) {
            int newX = x + direction[0];
            int newY = y + direction[1];
            if (newX >= 0 && newX < 3 && newY >= 0 && newY < 3) {
                lights[newX][newY] = 1 - lights[newX][newY];  // Toggle light
            }
        }
    }
}
