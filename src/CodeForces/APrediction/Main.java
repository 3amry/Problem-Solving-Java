package CodeForces.APrediction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        isNextPrime();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static int nextPrime(int prime) {
        while (true) {
            if (isPrime(++prime))
                return prime;
        }
    }

    public static void isNextPrime() {
        Scanner scan = new Scanner(System.in);
        int firstPrime = scan.nextInt();
        int number = scan.nextInt();
        int nextPrime = nextPrime(firstPrime);
        if (number == nextPrime){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
