package lesson5;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
//        MyReck mr = new MyReck();
//        int n = mr.enterTheNumber();
//        int s = mr.enterThePower();
//        int res = mr.exponentiationFunc(n, s);
//        System.out.println(res);
        ////
        System.out.println("2 task");
        Element e1 = new Element("e1",2,1);
        Element e2 = new Element("e2",7,2);
        Element e3 = new Element("e3",1,5);
        Element e4 = new Element("e4",3,7);
        Element e5 = new Element("e5",4,8);
        Element e6 = new Element("e6",5,10);
        LinkedList <Element> lElem = new LinkedList<Element>();
        lElem.add(e1);
        lElem.add(e2);
        lElem.add(e3);
        lElem.add(e4);
        lElem.add(e5);
        lElem.add(e6);

        Knapsack knapsack = new Knapsack(10, lElem);
        knapsack.addElement();
        knapsack.display();


    }
}
