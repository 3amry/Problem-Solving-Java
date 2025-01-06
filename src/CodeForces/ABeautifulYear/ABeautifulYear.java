package CodeForces.ABeautifulYear;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ABeautifulYear {
    public static int nextBeautifulYear() {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        while (true) {
            if (isDistinct(++year)) {
                System.out.println(year);
                return year;
            }
        }
    }
    public static boolean isDistinct(int number) {
        Set<Integer> distinctDigits = new HashSet<>();

        while (number > 0) {
            if (!distinctDigits.add(number % 10)) return false;
            number = number / 10;
        }
        return true;
    }
}
