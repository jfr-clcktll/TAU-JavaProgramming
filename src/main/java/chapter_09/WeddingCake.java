package chapter_09;

/*
Create a WeddingCake class which inherits from Cake
and has a field called tiers.
Its constructor should set the flavor.
Include getter and setter method.
 */

public class WeddingCake extends Cake{

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    private int tiers;

    public WeddingCake(String flavor) {
        super(flavor);
    }
}
