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
                juniorGui.moveCars(i, player[i].currentPosition(1, 23), player[i].updatePosition(die.getValue()));
                //Subtracts money from the currentplayer and gives money to the player owning the field

                properties.Fieldproperties(player[i].currentPosition(1, 23));
                if (properties.getOwnedFields()[player[i].currentPosition(1, 23)] != i + 1) {
                        player[i].playerBalanceUpdate(0 - properties.calculateValue(player[i].currentPosition(1, 23)));

                        if (properties.getOwnedFields()[player[i].currentPosition(1, 23)] != 0) {

                        player[properties.getOwnedFields()[player[i].currentPosition(1, 23)] - 1].
                                playerBalanceUpdate(properties.getValue());

                        juniorGui.updateGuiBalance(properties.getOwnedFields()[player[i].currentPosition(1, 23)] - 1, player[properties.getOwnedFields()[player[i].currentPosition(1, 23)] - 1].playerBalance());
                    }
                }
                juniorGui.updateGuiBalance(i, player[i].playerBalance());

                juniorGui.landOnField(i, player[i].currentPosition(1, 23), player[i].playerString(), properties.getOwningStatus(), properties.getOwnedFields());

                properties.setOwnedFields(properties.getOwnedFields(), player[i].currentPosition(1, 23), i);

                if (properties.isInPrison()) {
                    juniorGui.moveToPrison(i,player[i].currentPosition(1, 23));
                    player[i].setInPrison();
                    properties.resetPrisonStatus();
                }
            }
        }


    }


}
