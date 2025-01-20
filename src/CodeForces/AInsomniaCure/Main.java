package CodeForces.AInsomniaCure;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        countEscapedDragons();
    }

    public static void countEscapedDragons() {
        Scanner scan = new Scanner(System.in);
        int damagedCounter = 0;
        int[] intervals = new int[4];
        for (int i = 0; i < 4; i++) {
            intervals[i] = scan.nextInt();
        }

        int d = scan.nextInt();
        for (int i = 1; i <= d; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % intervals[j] == 0) {
                    damagedCounter++;
                    break;
                }
            }
        }

        scan.close();
        System.out.println(damagedCounter);
    }
}
