package leetcode.Stacks.StackUsingQueues_225;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> enQueue = new ArrayDeque<>();
    private Queue<Integer> deQueue = new ArrayDeque<>();
    private int top;

    public MyStack() {
    }

    public void push(int x) {
        enQueue.add(x);
        top = x;
    }

    public int pop() {
        if (empty())
            throw new IllegalStateException();

        while (enQueue.size() > 1) {
            top = enQueue.remove();
            deQueue.add(top);
        }

        var temp = enQueue;
        enQueue = deQueue;
        deQueue = temp;

        return deQueue.remove();
    }

    public int top() {
        if (empty())
            throw new IllegalStateException();

        return top;
    }

    public boolean empty() {
        return enQueue.isEmpty();
    }
}
