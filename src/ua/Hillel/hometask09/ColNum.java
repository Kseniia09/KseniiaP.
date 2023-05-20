package ua.Hillel.hometask09;

import LessonsAll.Lesson12.myComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColNum {
    public static void main(String[] args) {

        List<Integer> basket1 = new ArrayList<>();
        List<Integer> basket2 = new ArrayList<>();
        List<Integer> basket3 = new ArrayList<>();

        Random random = new Random();
        int rNum;
        List<Integer> randomNums = new ArrayList<>();                             //collection with random numbers

        for (int i = 1; i <= 100; i++) {
            int randomNumber = random.nextInt(100);
            randomNums.add(randomNumber);

                if (i%2 == 0) basket1.add(i);
                else if (i%3 == 0) basket2.add(i);
                //else if (i%6 == 0)  basket1.add(i);       //??????
                else basket3.add(i);
            }


            randomNums.sort(new myComparator());
           // System.out.println(randomNums);
            System.out.println("BASKET1:" + basket1);
            System.out.println("BASKET2:" + basket2);
            System.out.println("BASKET3:" + basket3);
            System.out.println(randomNums.size());

        }

    }

