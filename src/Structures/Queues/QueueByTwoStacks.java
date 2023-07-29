package Structures.Queues;

import java.util.Stack;

public class QueueByTwoStacks {
    private Stack<Integer> enStack = new Stack<>();
    private Stack<Integer> deStack = new Stack<>();

//        O(1)
    public void enqueue(int number){
        enStack.push(number);
    }

//        O(n)
    public int dequeue(){
        if (deStack.isEmpty()){
        while (!enStack.isEmpty())
            deStack.push(enStack.pop());
        }

        return deStack.pop();
    }

//        O(n)
    public int peek(){
        if (deStack.isEmpty()){
            while (!enStack.isEmpty())
                deStack.push(enStack.pop());
        }

        return deStack.peek();
    }

    public boolean isEmpty(){
        return (enStack.isEmpty() && deStack.isEmpty());
    }
}
