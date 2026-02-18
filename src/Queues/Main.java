package Queues;

public class Main {
    public static void main(String[] args){
        Queue myQueue = new Queue(10);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.enqueue(15);
        myQueue.enqueue(20);
        myQueue.enqueue(25);

        myQueue.deQueue();
        myQueue.printQueue();
    }
}
