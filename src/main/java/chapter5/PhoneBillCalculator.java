package chapter5;

import java.util.Scanner;

/*
PHONE BILL CALCULATOR - METHODS CHAPTER
Calculate the final total of someone's cellphone bill
Allow the operator to input the plan fee and the number of overage minutes
Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill
 */

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double overageRate = 0.25;
    static double taxRate = 0.15;

    public static void main(String[] args) {

        // Get input from user
        double planFees = getPlanFees();
        double overageMinutes = getOverageMinutes();

        // Perform Calculations
        double overageFees = calculateOverageFees(overageMinutes);
        double subtotal = calculateSubTotal(planFees, overageFees);
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);

        // Print the Bill

         printBill(planFees, overageFees, tax, total);

    }

    // Get the input of Plan Fees
    public static double getPlanFees(){

        System.out.println("Please enter the cost of your Plan: ");
        return scanner.nextDouble();

    }

    // Get the input of Overage Minutes
    public static int getOverageMinutes(){

        System.out.println("Please enter your Overage Minutes: ");
        return scanner.nextInt();

    }

    // Calculate Overage Fees
    public static double calculateOverageFees(double overageMinutes){

        return overageMinutes * overageRate;

    }

    // Calculate Sub Total
    public static double calculateSubTotal(double planFees, double overageFees){

        return planFees + overageFees;
    }

    // Calculate Tax
    public static double calculateTax(double subtotal){

        return subtotal * taxRate;
    }

    // Calculate Total
    public static double calculateTotal(double subtotal, double tax){

        return subtotal + tax;
    }

    // Print the Itemized Bill
    public static void printBill(double planFees,double overageFees,double tax,double total){

        System.out.println("------------------------------");
        System.out.println("PHONE BILL STATEMENT");
        System.out.println("------------------------------");
        System.out.println("1. PLAN FEES :     $" + planFees );
        System.out.println("2. OVERAGE FEES :  $" + overageFees);
        System.out.println("3. TAX :           $" + tax);
        System.out.println("4. TOTAL :         $" + total);
        System.out.println("------------------------------");

    }
}
