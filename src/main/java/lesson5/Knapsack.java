package lesson5;

import java.util.LinkedList;

public class Knapsack {
    private int weightKnapsack;
    private LinkedList<Element> listElements;
    private LinkedList<Element> listElementsInKnapSack;
    private double priceElementsInKnapsack;

    public Knapsack(int weight, LinkedList<Element> listElements) {
        listElementsInKnapSack = new LinkedList<Element>();
        this.weightKnapsack = weight;
        this.listElements = listElements;
    }

    public void addElement() {
        if (listElements.isEmpty()) {
            return;
        }

        if (weightKnapsack == 0) {//нет места
            return;
        }

        Element elMaxSpecificWeight = listElements.getFirst();
        for (Element element : listElements) {
            if (element.getSpecificWeight() > elMaxSpecificWeight.getSpecificWeight()) {
                elMaxSpecificWeight = element;
            }
        }

        if (weightKnapsack >= elMaxSpecificWeight.getElementWeight()) {//есть место
            priceElementsInKnapsack = priceElementsInKnapsack + elMaxSpecificWeight.getElementPrice();
            weightKnapsack = weightKnapsack - elMaxSpecificWeight.getElementWeight();
            listElementsInKnapSack.add(elMaxSpecificWeight);
            listElements.remove(elMaxSpecificWeight);
            addElement();

        } else { //умещается не весь элемент
            System.out.println("put part of an element name = " + elMaxSpecificWeight.name);

            Element partOfelementMaxSpecificWeight = new Element(elMaxSpecificWeight.name1 +" / " + elMaxSpecificWeight.getElementWeight()+ " * " + weightKnapsack, weightKnapsack, elMaxSpecificWeight.getSpecificWeight() * weightKnapsack);
            listElementsInKnapSack.add(partOfelementMaxSpecificWeight);

            priceElementsInKnapsack += elMaxSpecificWeight.getSpecificWeight() * weightKnapsack;

            System.out.println("priceElementsInKnapsack = " + priceElementsInKnapsack);
            weightKnapsack = 0;
        }
    }

    public void display() {
        for (Element e : listElementsInKnapSack) {
            System.out.print(e.name1 + " ; ");
        }
    }
}
