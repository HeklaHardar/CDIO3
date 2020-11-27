

import Game.Model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardsTest {

    //Tests that the cards that are able to be drawn is a part of the 20 card deck.
    @Test
    public void getCardsTest() {
        CardPicker pick = new CardPicker();
        for (int i = 0; i < 1000; i++) {

            assertTrue(String.valueOf(true), pick.DrawCard() <= 20);
            assertTrue(String.valueOf(true), pick.DrawCard() >= 1);
        }
    }

    //Tests that the card drawn before can't be the same as the next card.
    @Test
    public void getCardsTest2() {

        CardPicker pick = new CardPicker();
        int firstCard;
        int secondCard;
        for (int i = 0; i < 1000; i++) {

            firstCard = pick.DrawCard();
            secondCard = pick.DrawCard();

            assertTrue(String.valueOf(true), firstCard != secondCard);

        }


    }
}
