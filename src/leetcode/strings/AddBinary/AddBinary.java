package leetcode.strings.AddBinary;

import java.util.Stack;

public class AddBinary {
    private static char carried;
    public static String add(String a, String b){

        var sum = new StringBuilder();
        var stackA = new Stack<Character>();
        var stackB = new Stack<Character>();
        addToStack(a, stackA);
        addToStack(b, stackB);

        char aNum;
        char bNum;
        carried = ' ';

        while (!stackA.isEmpty() && !stackB.isEmpty()){
            aNum = stackA.pop();
            bNum = stackB.pop();

            aNum = addCarriedTo(aNum);

            sum.append(add2Binaries(aNum, bNum));
        }

        while (!stackA.isEmpty()){
            aNum = stackA.pop();
            aNum = addCarriedTo(aNum);
            sum.append(aNum);
        }

        while (!stackB.isEmpty()){
            bNum = stackB.pop();
            bNum = addCarriedTo(bNum);
            sum.append(bNum);
        }

        if (carried == '1') {
            sum.append('1');
        }
        return sum.reverse().toString();
    }

    private static char addCarriedTo(char binary){
        if (carried == '1'){
            if (binary != '1'){
                binary = add2Binaries(binary, carried);
                carried = ' ';
            }
            else binary = add2Binaries(binary, carried);
        }
        return binary;
    }

    private static char add2Binaries(char bin1, char bin2){
        if (bin1 == bin2 && bin1 == '1'){
            carried = '1';
            return '0';
        }
        if (bin1 != bin2) return '1';
        return '0';
    }

    private static void addToStack(String str, Stack<Character> stack){
        for (var ch: str.toCharArray()){
            stack.push(ch);
        }
    }

}
