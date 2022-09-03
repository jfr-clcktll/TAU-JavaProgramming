package chapter_10;

public class Banana extends Fruit{

    public Banana(){
        this.setCalories(120);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana shake is more viable");
    }

    public void peel(){
        System.out.println("Banana has been peeled");
    }
}
