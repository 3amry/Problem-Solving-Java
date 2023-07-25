import Structures.Array;
import Structures.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromEnd(5));
    }
}