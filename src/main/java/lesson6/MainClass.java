package lesson6;

public class MainClass {
    public static void main(String[] args) {
        int unbalanced = 0;
        int balanced = 0;

        int level = 6;
        int countNode = (int) (Math.pow( 2, level)) - 1;

        for (int j = 0; j < 20; j++) {
            MyTreeMap<Integer, Integer> myTreeMap = new MyTreeMap<Integer, Integer>();
            for (int i = 0; i < countNode; i++) {
                int n = (int)(Math.random()*200) - 100;
                myTreeMap.put(n, n);
            }

            if (myTreeMap.isBalanceTree()) {
                balanced++;
            } else {
                unbalanced++;
            }
        }
        System.out.println("сбалансированных деревьев = " + balanced + ", не сбалансированных = " + unbalanced );
        System.out.println("Несбалансированных деревьев " + unbalanced / 20 * 100 + " %");

    }

}
