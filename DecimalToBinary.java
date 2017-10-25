/***********************************************
 * @ file DecimalToBinary.java
 * @ brief This program convert decimal numbers to binary.
 * @ author Jianqiu Xu (Tony)
 * @ date September 11, 2017
 ***********************************************/
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int n;
        int binary;
        int k0, k1, k2, k3, k4, k5, k6;

        System.out.println("Decimal to Binary =============================");
        System.out.print("Enter an integer less than or equal to 100: ");
        n = scnr.nextInt();

        k0 = n % 2;
        n = n / 2;
        k1 = n % 2;
        n = n / 2;
        k2 = n % 2;
        n = n / 2;
        k3 = n % 2;
        n = n / 2;
        k4 = n % 2;
        n = n / 2;
        k5 = n % 2;
        n = n / 2;
        k6 = n % 2;
        n = n / 2;
        binary = k6 * 1000000 + k5 * 100000 + k4 * 10000 + k3 * 1000 + k2 * 100 + k1 * 10 + k0 * 1;


        System.out.println("");
        System.out.println("");
        System.out.println("Thanks.");
        System.out.println("Your number is: " + binary);


        return;


    }
}
