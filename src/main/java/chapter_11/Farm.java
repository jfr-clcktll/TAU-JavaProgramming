package chapter_11;

public class Farm {

    public static void main(String[] args) {

        Animal pigAnimal = new Pig();
        pigAnimal.eat();
        pigAnimal.makeSound();

        Pig pig = new Pig();
        pig.makeSound();

        Duck duck = new Duck();
        duck.makeSound();
    }
}
