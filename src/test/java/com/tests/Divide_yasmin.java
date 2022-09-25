package test.java.com.tests;

import java.util.Scanner;

public class Divide_yasmin {
    public static void main(String[] args) {

        //number 5 and 2

        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int d = (a/b);
        System.out.println();
        System.out.println("The division of a and b is:" +d);

    }


}
