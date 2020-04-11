package lesson3;

import java.util.EmptyStackException;

public class MyDeq<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    private int begin = 0;
    private int end = 0;

    public MyDeq(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad size");
        }
        list = (Item[])new Object[capacity];
    }

    public MyDeq() {
        list = (Item[])new Object[DEFAULT_CAPACITY];
    }

    //метод вставки
    public void addLast(Item item) {
        if (isFull()) {  //если в массив заполнен
            throw new StackOverflowError();
        }

        if (isEmpty()) {
            list[end] = item;
            size++;
            return;
        }

        if(begin <= end && end == list.length - 1) {
            Item[] tempArr = (Item[]) new Object[list.length];
            System.arraycopy(list, begin, tempArr,begin - 1,size);
            list = tempArr;
            begin--;
            list[end] = item;
            size++;
        } else {
            end++;
            list[end] = item;
            size++;
        }
    }

    public void addFirst(Item item) {
        if (isFull()) {  //если в массив заполнен
            throw new StackOverflowError();
        }
        if (isEmpty()) {          //если в массиве нет элементов
            addLast(item);
            return;
        }
        if (begin != 0) {
            begin--;
            list[begin] = item;
            size++;
        } else {
            Item[] tempArr = (Item[]) new Object[list.length];
            System.arraycopy(list,0,tempArr,1,size);
            list = tempArr;
            list[0] = item;
            size++;
            end++;
        }
    }

    private int nextIndex(int index) {
        return (index +1) % list.length;
    }

    public Item getLast() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Item last = list[end];
        return last;
    }

    public Item getFirst() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public Item deleteLast() {
        Item last = getLast();
        list[end] = null;
        end--;
        size--;
        if (isEmpty()) {
            begin = 0;
            end = 0;
        }
        return last;
    }

    public Item deleteFirst() {
        Item first = getFirst();
        list[begin] = null;
        size--;
        begin++;
        if (isEmpty()) {
            begin = 0;
            end = 0;
        }
        return first;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public void printDeq() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
