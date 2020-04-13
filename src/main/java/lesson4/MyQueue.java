package lesson4;

public class MyQueue<T> {

    private MyLinkedList<T> myLinkedList;
    private int size;

    public MyQueue() {
        myLinkedList = new MyLinkedList<T>();
    }

    public void add(T item) {
        myLinkedList.insertLast(item);
    }

    public T remove() {
        return myLinkedList.removeFirst();
    }
    public void display() {
        myLinkedList.display();
    }

    public boolean isEmpty(){
        return myLinkedList.isEmpty();
    }

    public int size() {
        return myLinkedList.size();
    }
}
