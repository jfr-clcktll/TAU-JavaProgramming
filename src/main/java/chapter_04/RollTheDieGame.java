package chapter_04;

import java.util.Random;

/*
ROLL THE DIE GAME
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
-   Roll the die for the user (Generate a Random number between 1-6) and advance the user that number
    of spaces on the game board
-   After each roll, tell the user which game space they are on and how many more spaces they have to go to win
-   Repeat this 4 additional times for 5 rolls in total
-   However, if the user gets to 20 before 5 rolls, end the game - they've won
-   If they are greater than or less than 20 spaces exactly, they lose
-   Remember there are only 20 spaces on the board, so a message like "You advanced to space 22" is a bug
 */

public class RollTheDieGame {

    // Setup variables

    // VAR NUMBER OF Repetitions Limit
    static int numOfRepetitionsLimit = 6;

    // VAR NUMBER OF Repetitions Track
    static int numberOfRepetitionsTrack;


    // VAR SPACE Limit
    static int spaceLimit = 20;

    // VAR SPACE Track
    static int spaceTrack = 0;




    public static void main(String[] args) {

        // Check if user is over 20 spaces
        boolean isUserUnder = true;
        boolean move = true;

        // While loop

        while (isUserUnder && numberOfRepetitionsTrack < numOfRepetitionsLimit && move) {
            move = functionality();
            isUserUnder = isUserUnder();
            numberOfRepetitionsTrack++;

        }

        if(spaceTrack == 20){
            System.out.print("----------User WINS!!!--------------");
        }
        else{
            System.out.print("----------User LOSES!!-------------");
        }


    }

    // Main functionality
    public static boolean functionality(){

        System.out.println("\n");
        System.out.println("Starting a new turn");
        System.out.println("--------------------");
        System.out.println("TURN NO : " + (numberOfRepetitionsTrack+1));


        // Generate a Random Number
        int diceRoll = generateRandomNumber();


//        //Check if user can move
        boolean canUserMove = canUserMove(diceRoll);


//        // Move user dependent on above
        if (canUserMove) {
            moveUser(diceRoll);
            System.out.println("Allowing user to move forward");
        }
        else{
            System.out.println("User cannot move forward. User has rolled a " + diceRoll +
            " and cannot move forward");
        }

        // Tell user current space and how many spaces to go for win
        messageUser();
        return canUserMove;





    }

    // Generate Random Number
    public static int generateRandomNumber() {

        Random random = new Random();
        int randomRoll = random.nextInt(6) + 1;

        System.out.println("You Rolled a : " + randomRoll);
        return randomRoll;
    }

    // Move user
    public static void moveUser(int numberOfSpaces){

        spaceTrack = spaceTrack + numberOfSpaces;

    }

    // Message user
    public static void messageUser() {

        int remainingSpaces = spaceLimit - spaceTrack;
        System.out.println("User is currently on space : " + spaceTrack);
        System.out.println("User has " + remainingSpaces + " spaces remaining to Win game");

    }

    // Decide if user is over / under
    public static boolean isUserUnder() {

        return spaceTrack < spaceLimit;
        }

    // Check if User can move forward on this turn
    public static boolean canUserMove(int dieRollNumber){
        return spaceTrack + dieRollNumber < 20;
    }
    }








