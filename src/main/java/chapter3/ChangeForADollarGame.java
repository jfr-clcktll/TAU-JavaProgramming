package chapter3;

import java.util.Scanner;

/*
CHANGE FOR A DOLLAR GAME
The objective of the game is to enter enough change to equal exactly $1!
Create a program that asks a user to enter the quantities for the following coins:
pennies, nickels, dimes and quarters, Your program should count up the value of all the change.
If it's exactly $1, they win! If it's more than $1 tell them by how much they went over.
If it's less than $1, tell them by how much they went under.
Fell free to change the game for your country's currency!
 */

public class ChangeForADollarGame {

    // Set value of the coins as variable
    public static int penniesValue = 1;
    public static int nickelsValue = 5;
    public static int dimesValue = 10;
    public static int quartersValue = 25;
    public static int dollarValue = 100;

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

    int pennyCount = getPennies();
    int nickelCount = getNickels();
    int dimeCount = getDimes();
    int quarterCount = getQuarters();

    scanner.close();

    int sum = getSum(pennyCount, nickelCount, dimeCount, quarterCount);

         // If total is exactly $1 - User wins
    if(sum == dollarValue){
        System.out.println("Your total is exactly $1! You win!");
    }    // If total is > $1 - tell user how much they went over
    else if(sum > dollarValue){
        System.out.printf("Your total is greater than $1 by %d cents", (sum - dollarValue));
    }    // If total is < $1 - tell user how much they went under
    else{
        System.out.printf("Your total is less than $1 by %d cents", (dollarValue - sum));
    }

    }

    // Ask the user for pennies
    public static int getPennies(){

        System.out.println("How many pennies?");
        int pennyCount = scanner.nextInt();
        return pennyCount;
    }

    // Ask the user for nickels
    public static int getNickels(){

        System.out.println("How many nickels?");
        int nickelCount = scanner.nextInt();
        return nickelCount;
    }

    // Ask the user for dimes
    public static int getDimes(){

        System.out.println("How many dimes?");
        int dimeCount = scanner.nextInt();
        return dimeCount;
    }

    // Ask the user for quarters
    public static int getQuarters(){

        System.out.println("How many quarters?");
        int quarterCount = scanner.nextInt();
        return quarterCount;
    }

    // Calculate sum of coins
    public static int getSum(int pennies, int nickels, int dimes, int quarters){

        int sum = (pennies * penniesValue) + (nickels * nickelsValue) + (dimes * dimesValue) + (quarters * quartersValue);
        return sum;

    }





}





