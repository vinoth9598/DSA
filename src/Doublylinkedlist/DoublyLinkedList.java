package Doublylinkedlist;

public class DoublyLinkedList {
    private Node head ;
    private Node tail ;
    private int length ;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode ;
        tail = newNode ;
        length = 1 ;
    }

    public void printList(){
        Node temp = head ;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next ;
        }
    }
}

class Node {
    int value ;
    Node next ;
    Node prev ;
    Node(int value){
        this.value = value ;
    }
}
