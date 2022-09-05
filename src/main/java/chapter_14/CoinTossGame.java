package chapter_14;
/*
Create a CoinTossGame class which:
- creates two Players
- asks Player 1 to choose Heads or Tails
- ensures that Player 1's guess is valid
- automatically assigns Player 2's guess to the opposite side
of what Player 1 chose
- flips the coin
- determines winner based on what coin landed on
- uses methods appropriately
 */

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {

        Player Player1 = new Player("David");
        Player Player2 = new Player("Goliath");

        String player1SideChoice = chooseSide();
        Player1.setGuess(player1SideChoice);

        Player2.setGuess(setPlayer2Guess(Player1));

        Coin coin = new Coin();
        coin.flip();
        String actualSide = coin.getSide();

        if(Player1.getGuess().equalsIgnoreCase(actualSide)){
            System.out.println("Player 1 guessed correctly!");
        }else{
            System.out.println("Player 2 wins!");
        }

    }

    private static String setPlayer2Guess(Player Player1) {
        if(Player1.getGuess() == "HEADS"){
            return "TAILS";
        }else{
            return "HEADS";
        }
    }

    private static String chooseSide() {
        System.out.println("Player 1 please select a side : ");
        Scanner scanner = new Scanner(System.in);
        String player1SideChoice = scanner.next();

        while (!player1SideChoice.equalsIgnoreCase(Coin.HEADS)
            &&(!player1SideChoice.equalsIgnoreCase(Coin.TAILS))){
            System.out.println("Invalid guess. Please try again");
            player1SideChoice = scanner.next();
        }
        scanner.close();



        return player1SideChoice;

    }
}
