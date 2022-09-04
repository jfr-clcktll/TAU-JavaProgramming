package chapter_13;

public class DivideByZero {

    public static void main(String[] args) throws Exception {
        divideNumber(30);

        }

    private static void divideNumber(int number) throws Exception {
        try {
            int result = number/0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun");
    }
}
}
