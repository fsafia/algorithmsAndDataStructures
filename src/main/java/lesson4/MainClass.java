package lesson4;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.insertFirst(1);
        myLinkedList.insertFirst(1);
        myLinkedList.insertFirst(2);
        myLinkedList.insertFirst(3);
        myLinkedList.insertFirst(4);

        myLinkedList.display();
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());

        myLinkedList.removeLast();
        myLinkedList.display();

        System.out.println(myLinkedList.remove(9));
        myLinkedList.display();

        myLinkedList.insert(5, 9);
        myLinkedList.display();

        System.out.println(myLinkedList.remove(9));
        System.out.println(myLinkedList.contains(0));
        myLinkedList.display();

        MyStack<String> myStack = new MyStack<String>();
        myStack.add("A");
        myStack.add("B");
        myStack.add("C");
        myStack.add("D");
        myStack.display();
        myStack.remove();
        myStack.remove();
        myStack.display();

        MyQueue<String> myQueue = new MyQueue<String>();
        myQueue.add("A");
        myQueue.add("B");
        myQueue.add("C");
        myQueue.add("D");
        myQueue.display();
        myQueue.remove();
        System.out.println(myQueue.remove());
        myQueue.display();

    }
}
