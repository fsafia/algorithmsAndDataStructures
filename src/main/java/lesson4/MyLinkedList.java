package lesson4;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    private void insert(T item) {
        Node<T> newNode = new Node(item);
        first = newNode;
        last = newNode;
        newNode.setNext(null);
        newNode.setPrev(null);
        size++;
    }

    public void insertFirst(T item) {
        if (isEmpty()) {
            insert(item);
        } else {
            Node<T> newNode = new Node(item);
            newNode.setNext(first);
            newNode.setPrev(null);
            first.setPrev(newNode);
            first = newNode;
            size++;
        }

    }

    public void insertLast(T item) {
        if (isEmpty()) {
            insert(item);
        } else {
            Node<T> newNode = new Node(item);
            newNode.setNext(null);
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
            size++;
        }
    }

    public T removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> l = last;
            last = last.getPrev();
            size--;
            if (isEmpty()) {
                first = null;
            } else {
                last.setNext(null);
            }
            return l.getVal();
        }
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> f = first;
            first = first.getNext();
            size--;
            if (isEmpty()) {
                last = null;
            } else {
                first.setPrev(null);
            }
            return f.getVal();
        }
    }

    public T getFirst(){
        if (isEmpty()) {
            return null;
        } else {
            return first.getVal();
        }
    }

    public T getLast(){
        if (isEmpty()) {
            return null;
        } else {
            return last.getVal();
        }
    }

    public int indexOf(T item) {
        int index = 0;
        if (isEmpty()) {
            return -1;
        }
        Node<T> currentNode = first;
        while (currentNode != null) {
            if (currentNode.getVal().equals(item)) {
                return index;
            } else {
                currentNode = currentNode.getNext();
                index++;
            }
        }
        return -1;
    }

    public boolean remove(T item) {
        if (isEmpty()) {
            return false;
        }
        if (first.getVal().equals(item)) {
            removeFirst();
            return true;
        }
        if (last.getVal().equals(item)) {
            removeLast();
            return true;
        }

        Node<T> currentNode = first.getNext();
        while (currentNode != null) {
            if (currentNode.getVal().equals(item)) {
                currentNode.getPrev().setNext(currentNode.getNext());
                currentNode.getNext().setPrev(currentNode.getPrev());
                size--;
                return true;
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    public void insert(int index, T item) {
        if (index <= 0) {
            insertFirst(item);
            return;
        }
        if (index >= size) {
            insertLast(item);
            return;
        }

        Node<T> currentNode;
        if (index >= size - index) {
            currentNode = last;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.getPrev();
            }
        } else {
            currentNode = first;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
        }
        Node<T> newNode = new Node<T>(item);
        newNode.setNext(currentNode);
        newNode.setPrev(currentNode.getPrev());
        currentNode.getPrev().setNext(newNode);
        currentNode.setPrev(newNode);
        size++;
    }

    public void display() {
        Node<T> currentNode = first;
        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.getVal() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public boolean contains(T item) {
        return indexOf(item) > -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
