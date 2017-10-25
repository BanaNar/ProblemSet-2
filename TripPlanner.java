/***********************************************
 * @ file TripPlanner.java
 * @ brief This program used as a simplistic trip planner.
 * @ author Jianqiu Xu (Tony)
 * @ date September 11, 2017
 ***********************************************/
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int npass;
        int miles;
        int cap;
        double price;
        int mpg;
        double tank;
        double t;
        double cost;
        double each;


        System.out.println("My Trip Planner =============================");
        System.out.print("Number of passengers: ");
        npass = scnr.nextInt();
        System.out.print("Length of the trip in mile: ");
        miles = scnr.nextInt();
        System.out.print("Capacity of the car's gas tank in gallons: ");
        cap = scnr.nextInt();
        System.out.print("Price of one gallon of gas: ");
        price = scnr.nextDouble();
        System.out.print("Miles/gallon of your car: ");
        mpg = scnr.nextInt();

        tank = cap / ( miles / mpg );
        t = Math.ceil(tank);
        cost = (miles / cap) * price;
        each = cost / npass;

        System.out.println("");
        System.out.println("You will need up to " + (int)t + " tanks of gas.");
        System.out.printf("The total cost will be %.2f dollars.\n", cost);
        System.out.printf("Each passenger should pay %.2f dollars.", each);

        return;

    }
}