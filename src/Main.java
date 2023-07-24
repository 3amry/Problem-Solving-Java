import Structures.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        Array numbers = new Array(3);
        numbers.print();
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
        numbers.removeAt(1);
        numbers.print();
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(40));
        numbers.reverse();
        numbers.print();
    }
}