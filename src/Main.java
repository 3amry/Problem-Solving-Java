import Structures.HashTables.Checker;
import Structures.HashTables.HashTable;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        var table = new HashTable();
        table.put(4, "ahem");
        table.put(6, "A");
        table.put(6, "A+");
        table.put(8, "B");
        table.put(11, "C");
        table.remove(11);
        System.out.println(table.get(6));
    }
}