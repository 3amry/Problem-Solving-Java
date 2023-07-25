package Structures;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size = 0;

    //O(1)
    public void addFirst(int number){
        Node newNode = new Node(number);
        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    //O(1)
    public void addLast(int number){
        Node newNode = new Node(number);
        if (head == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    //O(1)
    public void deleteFirst(){
        if (size == 0 || head == tail){
            head = tail = null;
            size = 0;
            return;
        }

        Node newHead = head.next;
        head.next = null;
        head = newHead;
        size--;
    }
    //O(n)
    public void deleteLast(){
//        NEED REFACTOR
        Node next = head.next;
        if (size == 0 || head == tail){
            head = tail = null;
            size = 0;
            return;
        }

        while (next.next != tail) {
            next = next.next;
        }

        next.next =null;
        tail = next;
        size--;
    }
    //O(n)
    public int indexOf(int number){
        Node node = head;
        int index = 0;
        while (node.value != number && node.next != null){
            node = node.next;
            index++;
        }
        if (node.value == number) return index;
        else return -1;
    }
//    O(1)
    public int size(){
        return size;
    }
    //O(n)
    public Boolean contains(int number){
        return (indexOf(number) != -1);
    }

//    O(n)
    public int[] toArray(){
        int[] array = new int[size];
        var node = head;
        for (int i = 0; i < size; i++){
            array[i] = node.value;
            node = node.next;
        }
        return array;
    }

//    O(2n) v2 is better
    public void reverse(){
        Object[] array = new Object[size];
        var node = head;
        for (int i = 0; i < size; i++){
            array[i] = node;
            node = node.next;
        }
        for (int i = size-1; i > 0; i--){
            node = (Node) array[i];
            node.next = (Node) array[i-1];
        }
        node = head;
        head = tail;
        tail = node;
        tail.next = null;
    }
//    O(n) Using two pointers
    public void reverse2(){
        var previous = head;
        var current = previous.next;

        while (current != null){
        var next = current.next;
            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
        tail = head;
        tail.next = null;
    }

    public int getKthFromEnd(int k){
        if (k > size) throw new IllegalArgumentException();

        var start = head;
        var end = head;
        int distance = k-1;
        while (distance != 0){
            end = end.next;
            distance--;
        }
        while (end != tail){
            end = end.next;
            start = start.next;
        }
        return start.value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
