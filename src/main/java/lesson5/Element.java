package lesson5;

public class Element {
    private int elementWeight;
    private double elementPrice;
    private double specificWeight;
    //
    public String name;
    public String name1;

    public Element(String name1, int elementWeight, double elementPrice) {
        this.elementWeight = elementWeight;
        this.elementPrice = elementPrice;
        this.specificWeight = elementPrice / elementWeight;
        this.name1 = name1;
        name = " elementPrice = " + elementPrice + "; h = " + elementWeight + " specificWeight = " + specificWeight;
    }

    public int getElementWeight() {
        return elementWeight;
    }

    public double getElementPrice() {
        return elementPrice;
    }

    public double getSpecificWeight() {
        return specificWeight;
    }
}
