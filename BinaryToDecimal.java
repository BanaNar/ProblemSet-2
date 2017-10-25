/***********************************************
 * @ file BinaryToDecimal.java
 * @ brief This program convert binary numbers to decimal.
 * @ author Jianqiu Xu (Tony)
 * @ date September 11, 2017
 ***********************************************/
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int n;
        int decimal = 0;
        int k0, k1, k2, k3, k4, k5;


        System.out.println("Binary to Decimal ===========================");
        System.out.print("Enter a binary number (6 digits max): ");
        n = scnr.nextInt();
        k0 = n % 10;
        n = n / 10;
        k1 = n % 10;
        n = n / 10;
        k2 = n % 10;
        n = n / 10;
        k3 = n % 10;
        n = n / 10;
        k4 = n % 10;
        n = n / 10;
        k5 = n % 10;
        decimal = k0 * 1 + k1 * 2 + k2 * 4 + k3 * 8 + k4 * 16 + k5 * 32;


        System.out.println("");
        System.out.println("");
        System.out.println("Thanks.");
        System.out.println("Your number is: " + decimal);



        return;

    }
}
