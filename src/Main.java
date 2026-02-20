
public class Main{
    public static void main(String[] args){
        BinarySearchTree myBst = new BinarySearchTree();
        myBst.insert(20);
        myBst.insert(25);
        myBst.insert(30);
        myBst.insert(35);
        myBst.insert(15);
        myBst.insert(10);
        myBst.insert(5);

        System.out.println(myBst.contains(27));
        System.out.println(myBst.contains(10));
    }
}