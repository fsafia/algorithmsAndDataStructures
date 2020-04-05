package lesson2.hw3;

public class mainClass {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
        myArray.insert(1000);
        myArray.insert(2000);
        myArray.insert(220);
        myArray.insert(30);
        myArray.insert(400);
        myArray.insert(5000);
        myArray.insert(8000);
        myArray.insert(60);
        myArray.insert(700);
        myArray.print();
        myArray.delete(2000);
        myArray.print();
        myArray.sortBubble();
        myArray.print();

        MyArray arraySortedBubble = new MyArray(1000000);
        arraySortedBubble.add(1000000);
        long time1 = System.currentTimeMillis();
        arraySortedBubble.sortBubble();
        System.out.println("delta time " + (System.currentTimeMillis() - time1));

        MyArray arraySortSelect = new MyArray(1000000);
        arraySortSelect.add(1000000);
        time1 = System.currentTimeMillis();
        arraySortSelect.sortSelect();
        System.out.println("delta time " + (System.currentTimeMillis() - time1));

        MyArray arraySortInsert = new MyArray(1000000);
        arraySortInsert.add(1000000);
        time1 = System.currentTimeMillis();
        arraySortInsert.sortInsert();
        System.out.println("delta time " + (System.currentTimeMillis() - time1));

    }
}
