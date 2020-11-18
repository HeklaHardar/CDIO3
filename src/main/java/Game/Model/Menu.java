package Game.Model;

import Game.View.JuniorGui;

public class Menu {

    // Defines variables and scanner
    private final String[] Players = new String[4];

    // Starts the menu
   /* public void Menu(int playernumber) {
        this.PlayerAmount = playernumber;
        System.out.println("Vælg antal spillere mellem 2-4");


        while (true) {
            //Makes the input of the user into lowercase
            if (PlayerAmount == 2) {
                break;
            } else if (PlayerAmount == 3) {
                break;
            } else if (PlayerAmount == 4) {
                break;
            }else {
                System.out.println("Ikke gyldig antal spiller mængde");
            }
        }
//        for (int i = 1; i<PlayerAmount;i++){
//
//            System.out.println("Indtast navn for spiller " + i + ": ");
//
//
//
//        }

        // If two players are selected
        if (PlayerAmount == 2) {
            System.out.println("Velkommen til spillet!");

            System.out.print("Indtast navn for spiller 1: ");
            String player1String = scan.nextLine();

            System.out.print("Indtast navn for spiller 2: ");
            String player2String = scan.nextLine();
            System.out.println("");
        }

        // If three players are selected
        else if (PlayerAmount == 3) {
            System.out.println("Velkommen til spillet!");

            System.out.print("Indtast navn for spiller 1: ");
            player1 = scan.nextLine();

            System.out.print("Indtast navn for spiller 2: ");
            player2 = scan.nextLine();

            System.out.print("Indtast navn for spiller 3: ");
            player3 = scan.nextLine();
            System.out.println("");
        }
        // If four players are selected
        else if (PlayerAmount == 4) {
            System.out.println("Velkommen til spillet!");

            System.out.print("Indtast navn for spiller 1: ");
            player1 = scan.nextLine();

            System.out.print("Indtast navn for spiller 2: ");
            player2 = scan.nextLine();

            System.out.print("Indtast navn for spiller 3: ");
            player3 = scan.nextLine();

            System.out.print("Indtast navn for spiller 4: ");
            player4 = scan.nextLine();
            System.out.println("");
        }
    }

    // Makes the variables accessible in other classes
    public int getPlayerAmount() {
        return PlayerAmount;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getPlayer3() {
        return player3;
    }

    public String getPlayer4() {
        return player4;
    }*/

   // JuniorGui juniorGui = JuniorGui.getInstance();

    private int playerNumber;

    public void startGame(JuniorGui juniorGui) {
        while (true) {
               playerNumber = juniorGui.gui.getUserInteger("Velkommen til spillet! \n" +
                    "Indtast antallet af spillere");
            if (playerNumber <= 4 && playerNumber >= 2)
                break;
            else
                juniorGui.gui.showMessage("ugyldig antal spillere");
        }
        for (int i = 1; i <= playerNumber; i++) {
            if(i==1)
                Players[i - 1] = juniorGui.gui.getUserString("Indtast navnet på den yngste spiller");
            else
                Players[i - 1] = juniorGui.gui.getUserString("Indtast navn for spiller " + i + ": ");

        }
    }

    public String[] playernamesToString(){return Players;}

    public int getPlayerAmount(){return playerNumber;}

}