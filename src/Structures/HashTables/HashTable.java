package Structures.HashTables;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {
private class Entry {
    private int key;
    private String value;
    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

    private LinkedList<Entry>[] table = new LinkedList[5];
//    O(1)/O(n)
    public void put(int key, String value){
        var entry = getEntry(key);
        if (entry != null){
            entry.value = value;
            return;
        }

        getOrCreateList(key).addLast(new Entry(key, value));
    }
//    O(1)/O(n)
    public String get(int key){
        if (!hasCollision(key))
            throw new IllegalStateException();

        return getEntry(key).value;
    }
//    O(1)/O(n)
    public void remove(int key){
        if (!hasCollision(key))
            throw new IllegalStateException();

        getList(key).remove(getEntry(key));
//        list.remove(entry);
    }

    private Entry getEntry(int key){
        var list = getList(key);
        if (hasCollision(key))
            for (var entry: list)
                if (entry.key == key)
                    return entry;
        return null;
    }

    private LinkedList<Entry> getList(int key){
        return table[hash(key)];
    }
    private LinkedList<Entry> getOrCreateList(int key){
        int index = hash(key);
        if (!hasCollision(key))
            table[index] = new LinkedList<>();

        return getList(key);
    }

    private boolean hasCollision(int key){
        return table[hash(key)] != null;
    }
    private int hash(int number){
        return number % table.length;
    }

}
