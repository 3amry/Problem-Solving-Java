package Structures.Stacks;

import java.util.Arrays;
import java.util.LinkedList;

public class StackByList {
    LinkedList<Integer> list = new LinkedList<>();

    public void push(int number){
        list.addLast(number);
    }
    public boolean isEmpty(){
        return list.size() == 0;
    }


    public int pop(){
        if (isEmpty())
            throw new IllegalStateException();

        return list.removeLast();
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        return list.getLast();
    }

    @Override
    public String toString() {
        var content = list.toArray();
        return Arrays.toString(content);
    }
}
