package Game;

public class CardPicker {

    private int random1;
    private int random2;
    private int temp;
    private int[] cards = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    private int Counter = -1;
    private int first;
    Cards card = new Cards();

    //Randomises card order
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
    //Draws a card
    public void DrawCard(){
        System.out.println(" ");

        //Blah Blah noget med at trække et kort fra en anden klasse her

        first = cards[0];
        for (int i = 0; i < cards.length - 1;i++)
            cards[i] = cards[i+1];
        cards[cards.length - 1] = first;

        for (int i:cards
             ) {
            System.out.print(i + " ");
        }
    }


 /*   public String Card(){
        Counter +=1 ;
       return card.CardPick(1);
    }*/


}
