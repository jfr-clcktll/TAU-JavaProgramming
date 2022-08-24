package chapter_09;

/*
Create a BirthdayCake class which inherits from Cake
and has a field called candles.
Its constructor should set the flavor.
Include getter and setter method.
 */

public class BirthdayCake extends Cake{

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    private int candles;

    public BirthdayCake(String flavor) {
        super(flavor);
    }
}
