package Game.Controller;

import Game.Model.*;
import Game.View.JuniorGui;

public class Game {

    private final Player[] player = new Player[4];
    boolean isWinnerWinnerChickenDinner = false;
    private Player currentPlayer;
    private boolean DrawAnother = false;


    public void Game() {


        CardPicker cardPicker = new CardPicker();
        // JuniorGui juniorGui = JuniorGui.getInstance();
        JuniorGui juniorGui = new JuniorGui();
        Die die = new Die(6);
        cardPicker.CardScrambler();

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

        while (!isWinnerWinnerChickenDinner) {
            for (int i = 0; i <= menu.getPlayerAmount() - 1; i++) {
               // juniorGui.gui.getUserString("tryk enter for at slå");
                juniorGui.gui.getUserButtonPressed("","Slå terning");
                die.roll();
                juniorGui.ShowDie(die.getValue());

                //checks if the player is in prison and releases him if he is.
                player[i].releaseFromPrison(player[i].isInPrison());
                //Moves the car on the GUI and checks if player is over start.
                juniorGui.moveCars(i, player[i].currentPosition(), player[i].updatePosition(die.getValue()));
                //Subtracts money from the currentplayer and gives money to the player owning the field


                if(player[i].currentPosition()==3 ||player[i].currentPosition()==9||player[i].currentPosition()==15||player[i].currentPosition()==21){
                    while(true) {
                        cardPicker.DrawCard();
                        juniorGui.displayCard(cardPicker.Card());
                        juniorGui.gui.getUserButtonPressed(cardPicker.Card(),"ok");

                        if (cardPicker.hasExtraMoves()) {
                            juniorGui.moveCars(i, player[i].currentPosition(), player[i].updatePosition(cardPicker.move()));
                            juniorGui.updateGuiBalance(i, player[i].playerBalance());

                        }
                        if (cardPicker.hasintOptions()) {
                            juniorGui.moveCars(i, player[i].currentPosition(), player[i].updatePosition(juniorGui.getIntSelection(cardPicker.Card(), cardPicker.min(), cardPicker.max())));
                        }
                        player[i].playerBalanceUpdate(cardPicker.cardMoney());
                        juniorGui.updateGuiBalance(i, player[i].playerBalance());
                        if (cardPicker.prisonCard()) {
                            player[i].updatePrisonCard(true);
                        }
                        if (cardPicker.birthday()) {
                            for (int y = 0; y <= menu.getPlayerAmount() - 1; y++) {
                                player[y].playerBalanceUpdate(-1);
                                juniorGui.updateGuiBalance(y, player[y].playerBalance());
                            }
                            player[i].playerBalanceUpdate(menu.getPlayerAmount());
                            juniorGui.updateGuiBalance(i, player[i].playerBalance());
                        }
                        if (cardPicker.hasStringOptions()) {
                            juniorGui.moveCars(i, player[i].currentPosition(), player[i].setPosition(juniorGui.getStringSelection(cardPicker.possibleFields())));
                            juniorGui.updateGuiBalance(i, player[i].playerBalance());
                        }
                        if (cardPicker.ishasMoveOrCard()) {
                            if (juniorGui.getMoveOrCard() == 1)
                                DrawAnother = true;
                            else {
                                DrawAnother = false;
                                juniorGui.moveCars(i,player[i].currentPosition(),player[i].setPosition(player[i].updatePosition(1)));
                            }
                            cardPicker.resetCardStats();
                        }
                        if(DrawAnother) {
                            DrawAnother = false;
                        }
                        else
                            break;

                    }
                    cardPicker.resetCardStats();
                }



                    properties.Fieldproperties(player[i].currentPosition());
                    if (properties.getOwnedFields()[player[i].currentPosition()] != i + 1) {

                        if(cardPicker.freeField() && properties.getOwnedFields()[player[i].currentPosition()] == 0)
                            player[i].playerBalanceUpdate(0);
                        else
                            player[i].playerBalanceUpdate(-properties.calculateValue(player[i].currentPosition()));

                        cardPicker.resetFreeField();


                        //Pays rent if a field is owned
                        if (properties.getOwnedFields()[player[i].currentPosition()] != 0) {
                            player[properties.getOwnedFields()[player[i].currentPosition()] - 1].playerBalanceUpdate(properties.getValue());
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

                    if (player[i].playerBalance() < 0) {

                        int[] balances = new int[menu.getPlayerAmount()];
                        for(int j=0; j<
                                balances.length; j++) {
                            int money = player[j].playerBalance();
                            balances[j] = money;
                        }
                        int temporary=0;
                        int balanceid = 0;
                        int finalbalanceid = 0;

                        for(int balance:balances){
                            if(temporary<balance){
                                temporary = balance;
                                finalbalanceid = balanceid;

                            }
                                balanceid+=1;
                        }
                            System.out.println("The winner is: " + player[finalbalanceid].playerString() + " With " + player[finalbalanceid].playerBalance() + "Points");
                        isWinnerWinnerChickenDinner = true;
                        break;
                }
            }
        }


    }


}
