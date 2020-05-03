package lesson8;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<String, Integer> chm = new ChainingHashMap();

        chm.put("one", 1);
        chm.put("two", 2);
        chm.put("three", 3);
        chm.put("foure",4);
        chm.put("five", 5);
        System.out.println(chm.toString());
        ;

        chm.remove("foure");
        System.out.println(chm.toString());
    }
}
