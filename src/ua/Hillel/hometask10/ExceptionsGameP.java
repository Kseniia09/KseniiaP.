package ua.Hillel.hometask10;

import javax.management.StringValueExp;
import java.util.Random;

public class ExceptionsGameP {
    private static final int NUMBER_OF_CARDS = 52;
    private final static int NUM_OF_PLAYERS = 4;

    private static String[] deck = new String[NUMBER_OF_CARDS];

    public static void main(String[] args) {
        try {                                                                       //Change NUMBER_OF_CARDS < 52
            createDeck();
            shuffleDeck();
            serveCards();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("You don't have enough cards to play!");
        } catch (RuntimeException r) {
            System.out.println("Check your deck");
        }
    }

    private static void createDeck()  {
        String[] suites  = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3" , "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit : suites) {
            for (String value : values){
                deck[index++] = value + " of " + suit;
            }
        }
    }
    private static void shuffleDeck() {
        Random random = new Random();
        try {
            for (int i = 0; i < 100; i++) {
                int in = random.nextInt(NUMBER_OF_CARDS);
                int out = random.nextInt(NUMBER_OF_CARDS);
                String tmpCArd = deck[in];
                deck[in] = deck[out];
                deck[out] = tmpCArd;
            }
        } catch (RuntimeException r) {
            System.out.println("Check your deck");
        }
    }

    private static void serveCards() {
        int index = 0;
        try {
            for (int round = 1; round <= 5; round++) {
                System.out.println("Round: " + round);

                for (int player = 1; player <= NUM_OF_PLAYERS; player++) {
                    System.out.println("Player " + player + " gets: " + deck[index++]);
                }
                System.out.println("********************************\n");
            }
        } catch (RuntimeException r) {
            System.out.println("Check your deck");
        }
    }
}





