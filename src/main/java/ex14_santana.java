import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
 */

public class ex14_santana
{
    public static void main( String[] args ) {
        System.out.println("What is the order amount? ");
        Scanner in1 = new Scanner(System.in);
        String ord = in1.nextLine();
        int n1 = Integer.parseInt(ord);
        System.out.println("What is the state? ");
        Scanner in2 = new Scanner(System.in);
        String state = in2.nextLine();
        double sub = Double.parseDouble(ord);
        System.out.printf("The subtotal is $%.2f.\n",sub);
        double tax=0;
        if (!state.equals("MN")) {
            tax = sub * 0.055;
        }
        System.out.printf("The tax is $%.2f.\n",tax);
        double tot = tax + sub;
        System.out.printf("The total is $%.2f.",tot);
    }
}
