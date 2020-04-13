package lesson4;

public class Node <T>{

    private T val;
    private Node next;
    private Node prev;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
    public Node(T val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
