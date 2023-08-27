package leetcode.strings.AddBinary_67;

public class AddBinaryV2 {
    public static String add(String a, String b){
        var sum = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carried = 0;
        int temp;

        while (i >= 0 || j >= 0){
            temp = carried;
            if (i >= 0) temp += a.charAt(i--) - '0';
            if (j >= 0) temp += b.charAt(j--) - '0';
            carried = temp > 1 ? 1 : 0;
            sum.append(temp % 2);
        }

        if (carried == 1) sum.append(carried);

        return sum.reverse().toString();
    }
 }
