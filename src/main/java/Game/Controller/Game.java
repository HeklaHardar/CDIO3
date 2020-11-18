package Game.Controller;

import Game.Model.*;
import Game.View.JuniorGui;

public class Game {

    private String Yngst;
    private String[] Tur = new String[4];
    private Player[] player = new Player[4];


    public void Game() {


        CardPicker cardPicker = new CardPicker();
        // JuniorGui juniorGui = JuniorGui.getInstance();
        JuniorGui juniorGui = new JuniorGui();
        Die die = new Die(6);

        Menu menu = new Menu();
        juniorGui.createGui();
        menu.startGame(juniorGui);
        Fieldproperties properties = new Fieldproperties();


        for (int i = 0; i <= menu.getPlayerAmount() - 1; i++) {
            player[i] = new Player(menu.playernamesToString()[i]);
            player[i].starterScore(menu.getPlayerAmount());
            juniorGui.guiPlayers(player[i].playerString(), player[i].playerBalance(), i);
            //juniorGui.gui.showMessage(player[i].playerString() + " " + player[i].playerBalance());
        }


        for (int e = 0; e < 1000; e++) {
            juniorGui.gui.getUserString("tryk enter for at slå");
            for (int i = 0; i <= menu.getPlayerAmount() - 1; i++) {
                die.roll();
                juniorGui.moveCars(i, player[i].currentPosition(), player[i].updatePosition(die.getValue()));
                properties.Fieldproperties(player[i].currentPosition(), i);
                juniorGui.updateGuiBalance(i, player[i].playerBalance());
                juniorGui.landOnField(i,player[i].currentPosition(),player[i].playerString(),properties.getOwningStatus(), properties.getOwnedFields());
            }
        }


        while (true) ;


    }


}
