package chapter_12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    private static void setDemo() {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println("---SET---");
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println();
    }

    private static void queueDemo() {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println("---QUEUE---");
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println();

        fruit.remove();
        System.out.println(fruit);

    }

    private static void listDemo() {
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println("---LIST---");
        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println();
    }

    private static void mapDemo() {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println("---MAP---");
        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);
        System.out.println();
    }

    public void print(Collection<String> collection){
        Iterator i = collection.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(String item : collection){
            System.out.println(item);
        }

        collection.forEach(System.out::println);
    }

    public void print(Map<String, Integer> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        map.forEach(
                (k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }


    }
