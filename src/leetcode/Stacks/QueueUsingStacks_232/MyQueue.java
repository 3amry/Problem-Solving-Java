package leetcode.Stacks.QueueUsingStacks_232;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> enStack = new Stack<>();
    private Stack<Integer> deStack = new Stack<>();
    public MyQueue() {

    }

//    O(1)
    public void push(int x) {
        enStack.push(x);
    }

//    O(n)
    public int pop() {
        if (empty())
            throw new IllegalStateException();

        moveEnToDeStack();

        return deStack.pop();
    }

    public int peek() {
        if (empty())
            throw new IllegalStateException();

        moveEnToDeStack();

        return deStack.peek();
    }

    public boolean empty() {
        return enStack.empty() && deStack.empty();
    }

    private void moveEnToDeStack() {
        if (deStack.empty()) {
            while (!enStack.empty())
                deStack.push(enStack.pop());
        }
    }
}
