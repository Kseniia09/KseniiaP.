package ua.Hillel.hometask03;

import java.util.Scanner;

public class Hometask0403 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println(" Enter the length of the first side of the triangle: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.println(" Enter the length of the second side of the triangle: ");
        Scanner in1 = new Scanner(System.in);
        b = in1.nextInt();

        System.out.println(" Enter the length of the third side of the triangle: ");
        Scanner in2 = new Scanner(System.in);
        c = in2.nextInt();

        if (a==b || a==c || b==c)
        {
            System.out.println("The triangle is isosceles");
    }

         else {System.out.println("The triangle isn't isosceles");
}}}

