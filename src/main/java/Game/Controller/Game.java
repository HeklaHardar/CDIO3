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

            for (int i = 0; i <= menu.getPlayerAmount() - 1; i++) {
                juniorGui.gui.getUserString("tryk enter for at slå");
                die.roll();

                //checks if the player is in prison and releases him if he is.
                player[i].releaseFromPrison(player[i].isInPrison());
                //Moves the car on the GUI and checks if player is over start.
                juniorGui.moveCars(i, player[i].currentPosition(), player[i].updatePosition(1));
                //Subtracts money from the currentplayer and gives money to the player owning the field

                properties.Fieldproperties(player[i].currentPosition());
                if (properties.getOwnedFields()[player[i].currentPosition()] != i + 1) {
                        player[i].playerBalanceUpdate(0 - properties.calculateValue(player[i].currentPosition()));

                        if (properties.getOwnedFields()[player[i].currentPosition()] != 0) {

                        player[properties.getOwnedFields()[player[i].currentPosition()] - 1].
                                playerBalanceUpdate(properties.getValue());

                        juniorGui.updateGuiBalance(properties.getOwnedFields()[player[i].currentPosition()] - 1, player[properties.getOwnedFields()[player[i].currentPosition()] - 1].playerBalance());
                    }
                }
                juniorGui.updateGuiBalance(i, player[i].playerBalance());

                juniorGui.landOnField(i, player[i].currentPosition(), player[i].playerString(), properties.getOwningStatus(), properties.getOwnedFields());

                properties.setOwnedFields(properties.getOwnedFields(), player[i].currentPosition(), i);

                if (properties.isInPrison()) {
                    juniorGui.moveToPrison(i,player[i].currentPosition());
                    player[i].setInPrison();
                    properties.resetPrisonStatus();
                }
            }
        }


    }


}
