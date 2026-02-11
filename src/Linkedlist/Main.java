package Linkedlist;

public class Main {

    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(6);

        myLinkedList.append(10);
        myLinkedList.append(15);
        myLinkedList.append(20);
        myLinkedList.append(25);

        myLinkedList.prepend(5);
        myLinkedList.prepend(4);
        myLinkedList.prepend(3);

        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println("get data " + myLinkedList.get(3).value);
        System.out.println("Set value " + myLinkedList.set(3, 8));

        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
