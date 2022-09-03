package chapter_10;

public class Apple extends Fruit{

    public Apple(){
        this.setCalories(200);
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice has been made");
    }

    public void removeSeeds(){
        System.out.println("Seeds have been removed");
    }


}
