package lesson3;

public class MainClass {
    public static void main(String[] args) {
//        BackString bs = new BackString("123456789");
//        bs.printBackString();

        MyDeq<String> myDeq = new MyDeq<String>(5);
        myDeq.addLast("a");
        myDeq.addLast("d");

        myDeq.printDeq();

        myDeq.addFirst("A");
        myDeq.addFirst("B");
        myDeq.printDeq();

        myDeq.deleteLast();
        myDeq.deleteFirst();
        myDeq.printDeq();

        myDeq.deleteLast();
        myDeq.deleteFirst();
        myDeq.printDeq();

        myDeq.addFirst("A");
        myDeq.addFirst("A");
        myDeq.deleteFirst();
        myDeq.deleteFirst();
        myDeq.printDeq();
    }
}
