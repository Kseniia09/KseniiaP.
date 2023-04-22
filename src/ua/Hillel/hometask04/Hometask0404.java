package ua.Hillel.hometask04; //short deck

public class Hometask0404 {
    public static void main(String[] args) {

        int cardsForPlayer = 5;
        int players = 4;
        String [] cardSuits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String [] cardNames = {"6", "7", "8","9", "10","Jack","Queen","King","Ace"};

        int numberOfCards = cardSuits.length * cardNames.length;
        System.out.println("Total number of cards is " + numberOfCards );

        String[] deck = new String[numberOfCards];
        for (int i = 0; i < cardNames.length; i++) {
            for(int j =0; j < cardSuits.length; j++) {
                deck[cardSuits.length*i+j] = cardNames[i]+ "" + cardSuits[j];

            }
        }


    }
}
