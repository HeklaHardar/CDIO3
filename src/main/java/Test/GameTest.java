package Test;
import Game.Controller.Game;
import Game.Model.Fieldproperties;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GameTest {

    @org.junit.jupiter.api.Test
    void game() {

        Game game = new Game();
        game.Game();
    }

    @org.junit.jupiter.api.Test
    void gameend() {
        Game game = new Game();

        game.Game();
    }

}