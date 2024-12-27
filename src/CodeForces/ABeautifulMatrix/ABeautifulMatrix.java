package CodeForces.ABeautifulMatrix;

import java.util.Scanner;

public class ABeautifulMatrix {
    public static int calNumOfMoves() {
        int numOfMoves = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 25; i++) {
            if (scan.nextInt() == 1){
                numOfMoves += Math.abs(2 - ((i / 5)));
                numOfMoves += Math.abs(2 - (i % 5));
                break;
            }
        }
        System.out.println(numOfMoves);
        return numOfMoves;
    }
}
