package Stack;

public class Main {
    public static void main(String[] args){
        Stacks myStack = new Stacks(5);

        myStack.getTop();
        myStack.getHeight();

        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        myStack.push(25);

        myStack.pop();
        myStack.printStack();
    }
}
