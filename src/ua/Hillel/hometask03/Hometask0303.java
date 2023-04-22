package ua.Hillel.hometask03;

import java.util.Scanner;

public class Hometask0303 {
    public static void main(String[] args) {

        int a;
        int b;

        System.out.println(" Enter first number: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.println(" Enter second number: ");
        Scanner in1 = new Scanner(System.in);
        b = in1.nextInt();

        if (Math.abs(a) > Math.abs(b)) {
            System.out.println (" The absolute value of the first number " + a + " is bigger than the absolute value of the second number " + b );
        }
        if (Math.abs(a)==Math.abs(b))  {
            System.out.println (" The absolute value of the first number " + a + " is equal to the absolute value of the second number  " + b );
        }
        else {
            System.out.println (" The absolute value of the second number "  + b + " is bigger than the absolute value of the first number " + a );
    }
}}

