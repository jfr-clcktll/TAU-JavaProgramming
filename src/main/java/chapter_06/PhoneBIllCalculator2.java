package chapter_06;

/*
-   Enhance the Phone bill exercise by redoing it in an object-oriented style
-   A phone bill should have an id, base cost, number of allotted minutes, and
number of minutes used. One should also be able to calculate the overage,
tax, and total on a phone bill, and also be able to print an itemized bill.
-   Include the following constructors: default, id-only, all fields. No matter which constructor is used,
all fields should be set.
-    Create a class that instantiates a phone bill and prints the itemized bill.
 */

public class PhoneBIllCalculator2 {

    public static void main(String[] args) {

        PhoneBill billOne = new PhoneBill();
        billOne.generateBill();

        PhoneBill billTwo = new PhoneBill(002);
        billTwo.generateBill();

        PhoneBill billThree = new PhoneBill(003, 100, 50, 65);
        billThree.generateBill();

        PhoneBill billFour = new PhoneBill(004);
        billFour.setNumberOfAllocatedMinutes(500);
        billFour.setNumberOfUsedMinutes(550);
        billFour.setBaseCost(2000);
        billFour.generateBill();

    }

}
