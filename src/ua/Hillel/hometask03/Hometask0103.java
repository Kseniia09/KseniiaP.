package ua.Hillel.hometask03;

import java.util.Scanner;

public class Hometask0103 {
    public static void main(String[] args) {
        //"CheckOddEven"

        Scanner yourNumber = new Scanner(System.in);
        System.out.println("Input your number");
        float a = yourNumber.nextFloat();
        if (a % 2 == 0) {
            System.out.println (" Your number is 'Even number' ");
        } else {
            System.out.println (" Your number is 'Odd' ");
        }
            System.out.println (" BYE ");

    }}
