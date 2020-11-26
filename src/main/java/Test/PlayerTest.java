package Test;
import Game.Model.Die;
import Game.Model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void getPlayerTest(){

        Die die = new Die(6);
        Player player = new Player("Test");

        for(int i = 0; i < 1000; i++){
            die.roll();
            player.updatePosition(die.getValue());
            assertTrue(String.valueOf(true),player.currentPosition() <= 23);
            assertTrue(String.valueOf(true),player.currentPosition() >= 0);

        }


    }

}
