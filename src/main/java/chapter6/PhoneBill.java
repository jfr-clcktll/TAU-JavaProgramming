package chapter6;

/*
-   Enhance the Phone bill exercise by redoing it in an object-oriented style
-   A phone bill should have an id, base cost, number of allotted minutes, and
number of minutes used. One should also be able to calculate the overage,
tax, and total on a phone bill, and also be able to print an itemized bill.
-   Include the following constructors: default, id-only, all fields. No matter which constructor is used,
all fields should be set.
-    Create a class that instantiates a phone bill and prints the itemized bill.
 */

import java.lang.Math;

public class PhoneBill {

    // CLASS ATTRIBUTES
    private int id;
    private double baseCost;
    private int numberOfAllocatedMinutes;
    private int numberOfUsedMinutes;
    private double overageCost;
    private double taxAmount;
    private double totalAmount;

    static double overageRate = 0.25;

    static double taxRate = 0.15;


    // CONSTRUCTOR # 1 - DEFAULT
    public PhoneBill (){
        this.setId(001);
        this.setBaseCost(500);
        this.setNumberOfAllocatedMinutes(500);
        this.setNumberOfUsedMinutes(200);

    }
    // CONSTRUCTOR # 2 - ID-ONLY
    public PhoneBill(int id){
        this.setId(id);
        this.setBaseCost(500);
        this.setNumberOfAllocatedMinutes(500);
        this.setNumberOfUsedMinutes(200);
    }

    // CONSTRUCTOR # 3 - ALL FIELDS
    public PhoneBill(int id, double baseCost, int numberOfAllocatedMinutes, int numberOfUsedMinutes){
        this.setId(id);
        this.setBaseCost(baseCost);
        this.setNumberOfAllocatedMinutes(numberOfAllocatedMinutes);
        this.setNumberOfUsedMinutes(numberOfUsedMinutes);

    }


    // GETTER / SETTER METHODS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getNumberOfAllocatedMinutes() {
        return numberOfAllocatedMinutes;
    }

    public void setNumberOfAllocatedMinutes(int numberOfAllocatedMinutes) {
        this.numberOfAllocatedMinutes = numberOfAllocatedMinutes;
    }

    public int getNumberOfUsedMinutes() {
        return numberOfUsedMinutes;
    }

    public void setNumberOfUsedMinutes(int numberOfUsedMinutes) {
        this.numberOfUsedMinutes = numberOfUsedMinutes;
    }

    public double getOverageCost() {
        return overageCost;
    }

    public void setOverageCost() {

        this.overageCost = overageRate * Math.max(0,getNumberOfUsedMinutes()-getNumberOfAllocatedMinutes());
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount() {
        this.taxAmount = taxRate * (baseCost + overageCost);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        this.totalAmount = baseCost + overageCost + taxAmount;
    }

    // Print the Itemized Bill
    public void generateBill() {

        this.setOverageCost();
        this.setTaxAmount();
        this.setTotalAmount();



        System.out.println("------------------------------");
        System.out.println("PHONE BILL STATEMENT");
        System.out.println("------------------------------");
        System.out.println("BILL ID : " + this.getId());
        System.out.println("1. PLAN FEES :     $" + this.getBaseCost());
        System.out.println("2. OVERAGE FEES :  $" + this.getOverageCost());
        System.out.println("3. TAX :           $" + this.getTaxAmount());
        System.out.println("4. TOTAL :         $" + this.getTotalAmount());
        System.out.println("------------------------------");
    }
}
