package chapter_14;
/*
Create a COIN Class which has the following :
- a field called side
- encapsulation
- constant variables for heads and tails
- a method called flip which randomly chooses heads or tails
and assigns the value to side
 */

import java.util.Random;

public class Coin {

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    private String side;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";

    public void flip(){
        Random random = new Random();
        int r = random.nextInt(2);
        if(r == 0){
            this.setSide(HEADS);
        }else{
            this.setSide(TAILS);
        }
        System.out.println("Coin flipped side : " + this.getSide());
    }

}
