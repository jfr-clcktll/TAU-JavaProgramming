package chapter_07;


// Update the lottery ticket class to ensure that the lottery ticket does not have duplicates

import java.util.Arrays;
import java.util.Random;

public class UpdatedLotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i= 0;i < LENGTH; i++){
            int randomNUmber;

            /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
             */
            do {
                randomNUmber = random.nextInt(MAX_TICKET_NUMBER);
            } while (search(ticket, randomNUmber));

            // Number is unique if we get here. Add it to the array.
            ticket[i] = randomNUmber;
        }

        return ticket;

    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */

    public static boolean search(int[] array, int numberToSearchFor) {

        /*
        This is called an enhanced loop.
        It iterates through an array and each time assigns
        the current element to the value.
         */
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }

        /*
        If we reached this point, then the entire array was searched
        and the value was not found
         */
        return false;
    }


    public static boolean binarySearch(int[] array, int numberToSearchFor) {

        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
