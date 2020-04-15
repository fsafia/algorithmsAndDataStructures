package lesson4;

public class MyStack<T> {

    private MyLinkedList<T> myLinkedList;
    private int size;


    public MyStack() {
        myLinkedList = new MyLinkedList<T>();
        size = 0;
    }

    public int size() {
        return myLinkedList.size();
    }

    public void add(T item) {
        myLinkedList.insertFirst(item);
    }

    public T remove() {
        return myLinkedList.removeFirst();
    }

    public boolean isEmpty(){
        return myLinkedList.isEmpty();
    }


    public void display() {
        myLinkedList.display();
    }

}
