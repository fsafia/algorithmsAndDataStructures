package lesson3;

public class MainClass {
    public static void main(String[] args) {
        BackString bs = new BackString("123456789");
        System.out.println(bs.printBackString());

        MyDeq<String> myDeq = new MyDeq<String>(5);
        myDeq.addFirst("A");
        myDeq.addFirst("B");
        myDeq.addFirst("C");
        myDeq.addFirst("D");
        myDeq.addFirst("E");
        myDeq.printDeq();
        System.out.println(myDeq.getLast());

        myDeq.deleteLast();
        myDeq.printDeq();
        myDeq.addFirst("a");

        myDeq.printDeq();
        System.out.println(myDeq.getFirst());
        System.out.println(myDeq.getLast());
        myDeq.addFirst("a");
        myDeq.printDeq();
        System.out.println(myDeq.getFirst());
        System.out.println(myDeq.getLast());

    }
}
