package NaymushinIgor.structures.task_1;

public class Deck {
    private String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
    private String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
    private int cardsCount = suits.length * rank.length;
    private int cardsOnHand = 5;
    private String[] deck;

    int getCardsCount() {
        return cardsCount;
    }

    void createDeck() {
        deck = new String[cardsCount];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
    }

    void mixDeck() {
        for (int i = 0; i < cardsCount; i++) {
            int r = i + (int) (Math.random() * (cardsCount - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }

    void showDealCards(int players) {
        for (int i = 0; i < players * cardsOnHand; i++) {
            System.out.println(deck[i]);
            if (i % cardsOnHand == cardsOnHand - 1)
                System.out.println();
        }
    }
}
