package CodeForces.BBorze;

public class Borze {
    public static void decode(String borze) {
        StringBuilder number = new StringBuilder();

        int i = 0;
        while (i < borze.length()) {
            char temp = borze.charAt(i);

            if (temp == '.') {
                number.append('0');
                i++;
            } else if (i + 1 < borze.length() && borze.charAt(i + 1) == '.') {
                number.append('1');
                i += 2;  // Skip the next character
            } else {
                number.append('2');
                i += 2;  // Skip the next character
            }
        }

        System.out.println(number);
    }
}
