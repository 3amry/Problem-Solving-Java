package CodeForces.ATram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        countMinCapacity();
    }

    public static void countMinCapacity() {
        Scanner scan = new Scanner(System.in);
        int minCapacity = 0;
        int currentPassengers = 0;
        int stops = scan.nextInt();

        for (int i = 0; i < stops; i++) {
            currentPassengers += - scan.nextInt() + scan.nextInt();
            if (currentPassengers > minCapacity)
                minCapacity = currentPassengers;
        }

        scan.close();
        System.out.println(minCapacity);
    }

}
