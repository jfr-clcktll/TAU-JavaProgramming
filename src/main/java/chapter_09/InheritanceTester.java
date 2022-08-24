package chapter_09;

public class InheritanceTester {

    public static void main(String[] args) {

        Person person = new Person();
        Employee employee = new Employee();

        person.setName("Tom");
        employee.setTitle("Actor");

        System.out.println(person.getName());
        System.out.println(employee.getTitle());

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("SQUARE");

        // Testing Woman and Mother Classes
        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
