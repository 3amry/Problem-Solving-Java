package CodeForces.AHorseShoe;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        countHorseShoe();
    }

    public static void countHorseShoe() {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> colors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            colors.add(scan.nextInt());
        }

        int horseShoeCount = 4 - colors.size();
        scan.close();
        System.out.println(horseShoeCount);
    }

}
