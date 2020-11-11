package Game;

import gui_fields.GUI_Player;
import gui_main.GUI;

import java.util.Scanner;

public class Menu {

    // Defines variables and scanner
    Scanner scan = new Scanner(System.in);
    private int PlayerAmount = 0;
    private String player1 = "";
    private String player2 = "";
    private String player3 = "";
    private String player4 = "";

    // Starts the menu
    public void Menu() {

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
            GUI_Player player1 = new GUI_Player(player1String,0);

            System.out.print("Indtast navn for spiller 2: ");
            String player2String = scan.nextLine();
            GUI_Player player2 = new GUI_Player(scan.nextLine(),0);
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
    }
}