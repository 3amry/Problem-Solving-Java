package Structures.Stacks;

import java.util.Arrays;

public class StackByArray {
    //    Stack int[]
    private int[] array = new int[5];
    private int count = 0;

    public boolean isEmpty(){
        return count == 0;
    }

    public void push(int number){
        if (count == array.length)
            throw new StackOverflowError();

        array[count++] = number;
    }

    public int pop(){
        if (isEmpty())
            throw new IllegalStateException();

        return array[--count];
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        return array[count -1];
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(content);
    }
}

