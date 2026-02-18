package Queues;

public class Main {
    public static void main(String[] args){
        Queue myQueue = new Queue(10);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
    }
}
