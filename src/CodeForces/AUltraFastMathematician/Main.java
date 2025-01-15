package CodeForces.AUltraFastMathematician;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        combine();
    }

    public static void combine() {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        StringBuilder answer = new StringBuilder();
        scan.close();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                answer.append(0);
            }else answer.append(1);
        }

        System.out.println(answer);
    }

}
