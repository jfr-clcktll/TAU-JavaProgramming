package chapter_10;

public class Market {

    public static void main(String[] args) {

        Fruit appleFruit = new Fruit();
        System.out.printf("Apple fruit has %d calories", appleFruit.getCalories());
        System.out.println();
        appleFruit.makeJuice();

        Apple apple = new Apple();
        System.out.printf("Apple has %d calories", apple.getCalories());
        System.out.println();
        apple.makeJuice();
        apple.removeSeeds();

        Banana banana = new Banana();
        System.out.printf("Banana has %d calories", banana.getCalories());
        System.out.println();
        banana.makeJuice();
        banana.peel();

        Fruit apple2 = new Apple();
        ((Apple) apple2).removeSeeds();
    }
}
