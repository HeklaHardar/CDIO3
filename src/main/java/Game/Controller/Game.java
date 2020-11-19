package Game.Controller;

import Game.Model.CardPicker;
import Game.Model.Die;
import Game.Model.Menu;
import Game.Model.Player;
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
        cardPicker.CardScrambler();

        Menu menu = new Menu();
        juniorGui.createGui();
        menu.startGame(juniorGui);


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
                juniorGui.updateGuiBalance(i, player[i].playerBalance());
                //juniorGui.buyField(i,player[i].currentPosition(),player[i].playerString());

                if(player[i].currentPosition()==3 ||player[i].currentPosition()==9||player[i].currentPosition()==15||player[i].currentPosition()==21){

                    cardPicker.DrawCard();
                    juniorGui.displayCard(cardPicker.Card());
                    if(cardPicker.hasExtraMoves()) {
                        juniorGui.moveCars(i, player[i].currentPosition(),  player[i].updatePosition(cardPicker.move()));
                        juniorGui.updateGuiBalance(i, player[i].playerBalance());
                    }
                    if(cardPicker.hasintOptions()){
                        juniorGui.moveCars(i, player[i].currentPosition(), player[i].updatePosition(juniorGui.getIntSelection(cardPicker.Card(),cardPicker.max(), cardPicker.min())));
                    }
                    player[i].playerBalanceUpdate(cardPicker.cardMoney());
                    juniorGui.updateGuiBalance(i,player[i].playerBalance());
                    cardPicker.resetCardStats();
                }

            }
        }


    }


}
