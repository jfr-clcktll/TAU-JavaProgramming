package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]){

        // Get Season name from user
        System.out.println("Please name a season: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Get an adjective from user
        System.out.println("Please give an adjective:");
        String adjective = scanner.next();

        // Get a Whole Number from user
        System.out.println("Please give a whole number:");
        int wholeNumber = scanner.nextInt();
        scanner.close();


        // Produce a Mad Lib
        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee.",adjective,season,wholeNumber);

    }
}
