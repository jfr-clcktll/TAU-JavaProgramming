package chapter_07;

/*
DAY OF THE WEEK
* Make an array that holds the textual values of the days of the week
* Have the user input a number corresponding to the day of the week.
  Assume the week start on Monday
* You program should output the String that represents the day of the week
* Example : User input the number 1, your program should print " MONDAY "
 */

import java.util.Scanner;

public class DayOfTheWeek {

    static String[] daysOfWeekText = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    // main application execution
    public static void main(String[] args) {
        // Set days of the week

        int day = getDayFromUser();
        String dayText = getDayText(day);
        printDayText(dayText);

    }


    // Get input from user from 1-7
    public static int getDayFromUser(){
        int day;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please Enter a number from 1-7");
            day = scanner.nextInt();}
        while(day > 7 || day < 1 );
        scanner.close();

        return day;
    }


    // Match against days of week and get day text
    public static String getDayText(int day) {
        return daysOfWeekText[day-1];

    }

    // Return day text to user
    public static void printDayText(String dayText){
        System.out.println("You selected : " + dayText);
    }

}
