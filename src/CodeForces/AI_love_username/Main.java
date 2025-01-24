package CodeForces.AI_love_username;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        countPeaks();
    }

    public static void countPeaks() {
        Scanner scan = new Scanner(System.in);
        int peakCounter = 0;
        int totalContests = scan.nextInt();
        int minScore = scan.nextInt();
        int maxScore = minScore;

        for (int i = 0; i < totalContests - 1; i++) {
            int temp = scan.nextInt();
            if (temp < minScore) {
                minScore = temp;
                peakCounter++;
            } else if (temp > maxScore) {
                maxScore = temp;
                peakCounter++;
            }
        }

        scan.close();
        System.out.println(peakCounter);
    }

}
