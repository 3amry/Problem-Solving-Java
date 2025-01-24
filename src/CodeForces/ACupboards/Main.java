package CodeForces.ACupboards;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        countSeconds();
    }

    public static void countSeconds() {
        Scanner scan = new Scanner(System.in);
        int seconds = 0;
        int leftSum = 0;
        int rightSum = 0;
        int cupboardsCount = scan.nextInt();

        for (int i = 0; i < cupboardsCount; i++) {
            leftSum += scan.nextInt();
            rightSum += scan.nextInt();
        }

//        minimum time to open/close all left and all right cupboards.
        seconds += Math.min(cupboardsCount - leftSum, leftSum);
        seconds += Math.min(cupboardsCount - rightSum, rightSum);


        scan.close();

        System.out.println(seconds);
    }

}
