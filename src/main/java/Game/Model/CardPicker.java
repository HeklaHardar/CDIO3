package Game.Model;

import Game.View.JuniorGui;

public class CardPicker {

    private int random1;
    private int random2;
    private int temp;
    private int[] cards = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    private int Counter = -1;
    private int first;

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

    public void DrawCard(){
        System.out.println(" ");
        first = cards[0];
        card.CardPick(15);

        for (int i = 0; i < cards.length - 1;i++)
            cards[i] = cards[i+1];
        cards[cards.length - 1] = first;
        Counter += 1;

        for (int i:cards
        ) {
            System.out.print(i + " ");
        }
    }




    public String Card(){
        return card.cardToString();
    }
    public int move(){
        if(card.booleanToString())
            return card.extraFields();
        else
            return 0;
    }
    public boolean hasExtraMoves(){
        return card.booleanToString();
    }
    public int cardMoney(){
        return card.extraMoney();
    }
    public boolean hasintOptions(){
        return card.isHasintOptions();
    }

    public int max(){
        return card.max();
    }
    public int min (){
        return card.min();
    }
    public void resetCardStats(){
        card.resetStats();
    }
    public boolean prisonCard(){
        return card.isHasPrisonCard();
    }
    public boolean birthday(){
        return card.isHasBirthday();
    }
    public String[] possibleFields(){return card.getPossibleFields();}
    public String[] fiveMoves(){
        return card.getFiveMoves();
    }
    public boolean hasStringOptions(){return card.isHasStringOptions();}
    public boolean ishasMoveOrCard(){
        return card.isMoveOrCard();
    }



}
