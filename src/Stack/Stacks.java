package Stack;

public class Stacks {
    private Node top ;
    private int height ;

    public Stacks(int value){
        Node newNode = new Node(value);
        top = newNode ;
        height = 1 ;
    }

    public void printStack(){
        Node temp = top ;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next ;
        }
    }
}

class Node {
    int value ;
    Node next ;
    Node(int value){
        this.value = value ;
    }
}
