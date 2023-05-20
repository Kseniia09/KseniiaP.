package ua.Hillel.hometask092;  //TASK (№1)

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DubNum {
    public static void main(String[] args) {
        Random number = new Random();

        List<Integer> ranNum = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            int randomNumber = number.nextInt(100);
            ranNum.add(randomNumber);
        }
        System.out.println(ranNum);

        List<Integer> notDub = new ArrayList<>();



        for (int i=0; i < ranNum.size(); i++)
        {
            if(!notDub.contains(ranNum.get(i)))
            {
                notDub.add(ranNum.get(i));
            }
        }
        System.out.println(notDub);
        System.out.println(ranNum.size()-notDub.size());              // amount of duplicates

    }
}