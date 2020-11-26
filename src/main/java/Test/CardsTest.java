package Test;
import Game.Model.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardsTest {

    @Test
    public void getCardsTest(){
        CardPicker pick = new CardPicker();
        for (int i = 0;i < 1000; i++){
            assertTrue(String.valueOf(true),pick.DrawCard() <= 20);
            assertTrue(String.valueOf(true),pick.DrawCard() >= 1);
        }
    }
}
