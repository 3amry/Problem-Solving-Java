package Structures.Queues;

import java.util.Arrays;

public class QueueByArray {
    private int[] array;

    public QueueByArray(int capacity) {
        this.array = new int[capacity];
    }

    private int count = 0;
    private int front = 0;
    private int rear = 0;

    public void enqueue(int number){
        if (isFull())
            throw new IllegalStateException();

//      Applying the Circular Array Concept
        array[rear] = number;
        rear = (rear + 1) % array.length;
        count++;
    }
    public int dequeue(){
        var item = array[front];
        array[front] = 0;
//      Applying the Circular Array Concept
        front = (front + 1) % array.length;
        count--;
        return item;
    }

    public int peek(){
        return array[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == array.length;
    }

    @Override
    public String toString() {
        int[] content = new int[count];
        for (int i = 0; i < count; i++)
//          Applying the Circular Array Concept
            content[i] = array[(front + i) % array.length];
        return Arrays.toString(content);
    }
}
