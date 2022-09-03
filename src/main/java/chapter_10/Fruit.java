package chapter_10;

/*
FRUIT MARKET
- Create a class called Fruit. This class should contain a field called calories
and a method called makeJuice which prints a statement (e.g. "Juice is made")

- Create two subclasses of the Fruit class (e.g. Apple, Banana) and create methods in
these classes that are specific to them (e.g. removeSeeds, peel)
- Set the calories within the constructors of these subclasses. Override the makeJuice
method to print the specific type of juice that's made.

- Create a Market class which tests polymorphism by creating several variations of these objects.
 */

public class Fruit {

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int calories;

    public Fruit(){
        };

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
