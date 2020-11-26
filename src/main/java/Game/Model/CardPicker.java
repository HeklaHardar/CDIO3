package Game.Model;

import Game.View.JuniorGui;

public class CardPicker {

    private int random1;
    private int random2;
    private int temp;
    private int[] cards = {2,3,4,5,7,8,9,10,11,14,15,16,17,18,19,20};
    private int first;
    private int cardNumber=0;

    private String testString;
    Cards card = new Cards();





    public void CardScrambler(){
        for (int i = 0; i < 1000 - 1; i++) {
            temp = cards[random1 = (int) (Math.random() * (cards.length))];
            cards[random1] = cards[random2 = (int) (Math.random() * (cards.length))];
            cards[random2] = temp;
        }
        for (int i: cards
             ) {
            System.out.print(i + " ");
        }

    }

    public int DrawCard(){
        cardNumber = cards[0];
        System.out.println(" ");
        first = cards[0];
        System.out.println(card.cardToString());
        //card.CardPick(14);
        for (int i = 0; i < cards.length - 1;i++)
            cards[i] = cards[i+1];
        cards[cards.length - 1] = first;
        for (int i:cards
        ) {
            System.out.print(i + " ");
        }
        return cardNumber;
    }




}
