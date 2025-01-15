package CodeForces.AStonesOnTheTable;

import java.util.Scanner;

public class AStones {
    public static void countMin() {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        int numOfStones = scan.nextInt();
        String stonesOrder = scan.next();
        scan.close();

        for (int i = 1; i < numOfStones; i++) {
            if (stonesOrder.charAt(i) == stonesOrder.charAt(i - 1))
                counter++;
        }
        System.out.println(counter);
    }
}
