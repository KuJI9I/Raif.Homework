package NaymushinIgor.structures.task_1;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int players = 0;
        int cardOnHand = 5;
        Deck deck = new Deck();
        deck.createDeck();
        deck.mixDeck();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (players == 0) {
                    System.out.println("Игра не может начаться без игроков");
                } else if (players * cardOnHand >= deck.getCardsCount()) {
                    System.out.println("Слишком много игроков!");
                } else {
                    System.out.println("Давай играть");
                    deck.showDealCards(players);
                    break;
                }
            }
        }

    }

}

