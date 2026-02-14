package Doublylinkedlist;

public class Main {

    public static void main(String[] args){
        DoublyLinkedList myDll = new   DoublyLinkedList(1);
//      append method
        myDll.append(10);
        myDll.append(15);
        myDll.append(20);
        myDll.append(25);

//      prepend method
        myDll.prepend(5);
        myDll.prepend(8);

//      removeLast method modification Node
       System.out.println("remove first : " +myDll.removeLast().value);
//       removeFirst method modification Node
       System.out.println("remove last : "+myDll.removeFirst().value);
//      get method by index return value ;
       System.out.println("get value by index :" + myDll.get(2).value);
//       set method return boolean
       myDll.set(1, 100);

//      insert value by index
        myDll.insert(4, 200);

//     remove method
        myDll.remove(4);

       myDll.printList();
    }
}
