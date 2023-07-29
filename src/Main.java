import Structures.Queues.PriorityQueue;
import Structures.Queues.QueueByArray;
import Structures.Queues.QueueByTwoStacks;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Problem Solving In Java!");

        QueueByTwoStacks queue = new QueueByTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        queue.enqueue(60);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}