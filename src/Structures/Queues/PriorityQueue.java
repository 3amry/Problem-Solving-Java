package Structures.Queues;

import java.util.Arrays;

public class PriorityQueue {
    private int[] array = new int[5];
    private int count = 0;

    //    O(n)
    public void add(int number){
        if (isFull())
            throw new IllegalStateException();

        int i = shiftNumbersToInsert(number);
        array[i] = number;
        count++;
    }

    //    O(1)
    public int remove(){
        if (isEmpty())
            throw new IllegalStateException();

        return array[--count];
    }

    public boolean isFull(){
        return count == array.length;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    //    O(n)
    private int shiftNumbersToInsert(int number){
        int i;
        for (i = count -1; i >= 0; i--){
            if (array[i] > number)
                array[i + 1] = array[i];
            else break;
        }
        return i+1;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
