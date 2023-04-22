package ua.Hillel.hometask04;

import java.util.Arrays;
import java.util.Random;

public class Hometask0204 {
    public static void main(String[] args) {
       int[] randNumbArray=new int[100];
       Random random= new Random();
       for (int i = 0; i< randNumbArray.length; i++) {
           randNumbArray[i] = random.nextInt(100);
       }
      // System.out.println(Arrays.toString(randNumbArray));

       for (int i = 0; i< randNumbArray.length; i++) {
           if (randNumbArray[i] % 2 ==0) {
               randNumbArray[i]=0;
           }
       }
       System.out.println(Arrays.toString(randNumbArray));
    }
}
