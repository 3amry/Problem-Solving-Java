package CodeForces.AYoungPhysicist;

import java.util.Scanner;

public class AYoungPhysicist {
    public static void isInEquilibrium(){
        Scanner scan = new Scanner(System.in);
        int x = 0, y = 0, z = 0;

        byte n = scan.nextByte();

        for (int i = 0; i < n; i++) {
            x += scan.nextInt();
            y += scan.nextInt();
            z += scan.nextInt();
        }

        if (x == 0 && y == 0 && z == 0){
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
