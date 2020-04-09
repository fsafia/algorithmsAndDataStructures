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
        list[end] = item;
        size++;
        end = nextIndex(end);
    }

    private int nextIndex(int index) {
        return (index +1) % list.length;
    }

//    private void reCapacity(int newCapacity) {
//        Item[] tempArr = (Item[]) new Object[newCapacity];
//        System.arraycopy(list,0,tempArr,0,size);
//        list = tempArr;
//    }

    public Item getLast() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Item last = list[end - 1];
        return last;
    }

    public Item getFirst() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public void addFirst(Item item) {
        if (isFull()) {  //если в массив заполнен
            throw new StackOverflowError();
        }
        if (isEmpty()) {          //если в массиве нет элементов
            addLast(item);
        } else {                 //если есть элементы, то индекс begin = 0 занят
            Item[] tempArr = (Item[]) new Object[list.length];
            System.arraycopy(list,0,tempArr,1,size);
            list = tempArr;
            list[0] = item;
            size++;
            end = nextIndex(end);
        }




    }

//    private Item peek() {
//        if (isEmpty()) {
//            throw new EmptyStackException();
//        }
//        return list[size - 1];
//    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

}
