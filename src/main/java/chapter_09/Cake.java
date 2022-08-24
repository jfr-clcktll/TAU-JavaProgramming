package chapter_09;

/*
Create a superclass called Cake that has two fields:
flavor and price,
and a constructor that accepts the flavor.
Getter and Setter methods should be created for the fields
 */

public class Cake {

    private String flavor;
    private int price;

    public Cake(String flavor) {
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
