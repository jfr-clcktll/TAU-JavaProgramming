package chapter_09;

public class TasteTester {

    public static void main(String[] args) {

        //Cake test
        Cake cake = new Cake("chocolate");
        cake.setPrice(50);

        System.out.printf("A Basic %S Cake is sold for $%d",cake.getFlavor(),cake.getPrice());
        System.out.println();

        //Birthday Cake test
        BirthdayCake birthdayCake = new BirthdayCake("vanilla");
        birthdayCake.setPrice(100);
        birthdayCake.setCandles(5);

        System.out.printf("A %S Birthday cake with %d candles is sold for $%d",birthdayCake.getFlavor(),birthdayCake.getCandles(),birthdayCake.getPrice());
        System.out.println();

        //Wedding Cake test
        WeddingCake weddingCake = new WeddingCake("strawberry");
        weddingCake.setPrice(150);
        weddingCake.setTiers(3);

        System.out.printf("A %S Wedding cake with %d tiers is sold for $%d",weddingCake.getFlavor(),weddingCake.getTiers(),weddingCake.getPrice());
        System.out.println();
    }
}
