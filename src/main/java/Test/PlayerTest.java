package Test;

import Game.Model.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    Player Testposition = new Player();

    @Test
    public void updatePosition() {
    assertEquals(Testposition.updatePosition(23), 0);
        System.out.println("updatePosition");
    }
}