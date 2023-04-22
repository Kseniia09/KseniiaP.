package ua.Hillel.hometask04;
import java.util.Arrays;
import java.util.Random;


public class Hometask0304 {
    public static void main(String[] args) {
        int[] randNumbArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < randNumbArray.length; i++) {
            randNumbArray[i] = random.nextInt();
        }
        System.out.println("The Array is: " + Arrays.toString(randNumbArray));
        int sum = 0;
        for (int i = 0; i < randNumbArray.length; i++) {
            sum = sum + randNumbArray[i];
        }
        System.out.println("The Sum is: " + sum);
        int averageSum = sum / randNumbArray.length;
        System.out.println("The Average Sum is: " + averageSum);
    }
}






