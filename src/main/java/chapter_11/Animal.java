package chapter_11;


/*
FARM
- Create an abstract class called Animal, which declares an abstract method called makeSound(),
and implements a non-abstract method called eat().
- Create a pig class and a Duck class that both extend the Animal class
- Create a Farm class to test the implementation

 */
public abstract class Animal {

    abstract void makeSound();

    public void eat(){
        System.out.println("I have eaten");;


    }

}
