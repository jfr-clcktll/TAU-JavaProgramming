package chapter_14;
/*
Create a PLAYER class which has the following:
- fields called name and guess
- encapsulation
- a constructor which accepts name
 */

public class Player {
    private String name;
    private String guess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public Player(String name) {
        this.name = name;
    }
}
