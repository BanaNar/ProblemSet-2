/***********************************************
 * @ file LoanCalculator.java
 * @ brief This program computes the monthly payment and total interest for the users, and gives tips.
 * @ author Jianqiu Xu (Tony)
 * @ date September 11, 2017
 ***********************************************/
import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double loan;
        int arate;
        int year;

        double mrate;
        double mpay;
        double npay;
        double totalInterest;

        double npayTIP;
        double mpayTIP;
        double totalInterestTIP;
        double save;

        double mrateTIP1;
        double mpayTIP1;
        double totalInterestTIP1;
        double save1;


        System.out.println("Monthly Payment Calculator =============================");
        System.out.print("Please enter the loan amount [e.g. 10000.00]: ");
        loan = scnr.nextDouble();
        System.out.print("Please enter the annual interest rate [e.g. 5]: ");
        arate = scnr.nextInt();
        System.out.print("Please enter the term of the loan in years [e.g. 6]: ");
        year = scnr.nextInt();

        mrate = arate / 12.0 / 100;
        npay = year * 12;
        mpay = loan * (mrate * Math.pow(1 + mrate, npay)) / (Math.pow(1 + mrate, npay) - 1);
        totalInterest = mpay * npay - loan;

        System.out.println("");
        System.out.println("");
        System.out.println("Monthly Payment: " + money.format(mpay));
        System.out.println("Total interest paid: " + money.format(totalInterest));

        npayTIP = (year - 1) * 12;
        mpayTIP = loan * (mrate * Math.pow(1 + mrate, npayTIP)) / (Math.pow(1 + mrate, npayTIP) - 1);
        totalInterestTIP = mpayTIP * npayTIP - loan;
        save = totalInterest - totalInterestTIP;

        System.out.println("");
        System.out.println("Just a tip:");
        System.out.println("Paying off the loan in " + (year - 1) + " years could save you " + money.format(save) + " in interest with a monthly payment of " + money.format(mpayTIP));

        mrateTIP1 = (arate - 1) / 12.0 / 100;
        mpayTIP1 = loan * (mrateTIP1 * Math.pow(1 + mrateTIP1, npay)) / (Math.pow(1 + mrateTIP1, npay) - 1);
        totalInterestTIP1 = mpayTIP1 * npay - loan;
        save1 = totalInterest - totalInterestTIP1;

        System.out.println("");
        System.out.println("Dropping your rate to " + (arate - 1) + "% could save you " + money.format(save1) + " in interest with a monthly payment of " + money.format(mpayTIP1));

        return;

    }
}
