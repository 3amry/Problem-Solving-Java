package CodeForces.AArrivalOfTheGeneral;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        countSteps();
    }

    public static void countSteps() {
        Scanner scan = new Scanner(System.in);
        int highest = Integer.MIN_VALUE;
        int highestIndex = -1;
        int shortest = Integer.MAX_VALUE;
        int shortestIndex = -1;
        int steps = 0;
        int size = scan.nextInt();
        int[] line = new int[size];

        for (int i = 0; i < size; i++) {
            line[i] = scan.nextInt();
            if (line[i] > highest) {
                highest = line[i];
                highestIndex = i;
            }
            if (line[i] <= shortest) {
                shortest = line[i];
                shortestIndex = i;
            }
        }
        scan.close();
        steps = highestIndex + (size - 1) - shortestIndex;

        if (highestIndex > shortestIndex)
            steps -= 1;
        System.out.println(steps);
    }

}
