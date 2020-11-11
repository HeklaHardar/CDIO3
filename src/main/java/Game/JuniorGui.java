package Game;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class JuniorGui {
    private int playerNumber = 0;
    GUI gui;
    public JuniorGui(){
            // Laver array
            GUI_Field[] fields = new GUI_Field[24];
            Color[] fieldColors = {Color.GREEN,Color.BLUE,Color.PINK,Color.YELLOW,Color.RED, Color.cyan, new Color(34,139,34)};
            String[] fieldTitles = {"Burgerbaren","Pizzariaet","","Slikbutikken","Iskiosken","","Museet","Biblioteket","","Skaterparken",
                    "Svømmingpoolen","", "Spillehallen", "Biografen","","Legetøjsbutikken","Dyrehandlen","","Bowlinghallen","Zoo","","Vandlandet","Strandpromenaden",""};

            // Laver orange startfelt
            fields[0] = new GUI_Start("Start", "", "Her starter du", Color.ORANGE, Color.WHITE);

            // Fylder resten af feltenre ud med veje
            for( int i=1; i<24; i++) {
                if (i == 3 || i == 9 || i == 15 || i == 21) {
                    fields[i] = new GUI_Chance();
                    fields[i].setDescription("Træk et chancekort");
                }
                else if(i==6){
                    fields[i] = new GUI_Jail();
                    fields[i].setSubText("På besøg");
                    fields[i].setDescription("På besøg");
                }
                else if(i==12) {
                    fields[i] = new GUI_Refuge();
                    fields[i].setTitle("Gratis parkering");
                    fields[i].setSubText("Gratis parkering");
                    fields[i].setDescription("Slap af for en tur");
                }
                else if(i==18){
                    fields[i] = new GUI_Jail();
                    fields[i].setSubText("Gå i fængsel");
                    fields[i].setDescription("Ryk i fængsel");
                }
                else {

                    fields[i] = new GUI_Street(
                            "Street " + i,
                            "Price: " + (i * 50),
                            "This is a street",
                            "100",
                            Color.PINK,
                            Color.BLACK
                    );
                    fields[i].setTitle(fieldTitles[i-1]);
                    if(3>i){
                        fields[i].setBackGroundColor(fieldColors[0]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 1M");
                    }
                    else if(3<i&i<6){
                        fields[i].setBackGroundColor(fieldColors[5]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 1M");
                    }
                    else if(6<i&i<9){
                        fields[i].setBackGroundColor(fieldColors[2]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 2M");
                    }
                    else if(9<i&i<12){
                        fields[i].setBackGroundColor(fieldColors[3]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 2M");
                    }
                    else if(12<i&i<15){
                        fields[i].setBackGroundColor(fieldColors[4]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 3M");
                    }
                    else if(15<i&i<18){
                        fields[i].setBackGroundColor(fieldColors[3]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 3M");
                    }
                    else if(18<i&i<21){
                        fields[i].setBackGroundColor(fieldColors[6]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 4M");
                    }
                    else if(21<i&i<24){
                        fields[i].setBackGroundColor(fieldColors[1]);
                        fields[i].setDescription(fieldTitles[i-1]);
                        fields[i].setSubText("Price: 5M");
                    }

                }
            }

            this.gui = new GUI(fields);
        }
        public int getPlayerNumber(){
            int PlayerNumber = gui.getUserInteger("Velkommen til spillet! \n" +
                    "Indtast antallet af spillere");
            this.playerNumber = PlayerNumber;
            return playerNumber;

        }
        public String[] getPlayerNames(){
        String[] Players = new String[4];
            if (playerNumber == 2) {

                Players[0] = gui.getUserString("Indtast navne for spiller 1: ");

                Players[1] = gui.getUserString("Indtast navne for spiller 2: ");
            }

            // If three players are selected
            else if (playerNumber == 3) {

                Players[0] = gui.getUserString("Indtast navne for spiller 1: ");

                Players[1] = gui.getUserString("Indtast navne for spiller 2: ");

                Players[2] = gui.getUserString("Indtast navne for spiller 3: ");
            }
            // If four players are selected
            else if (playerNumber == 4) {

                Players[0] = gui.getUserString("Indtast navne for spiller 1: ");

                Players[1] = gui.getUserString("Indtast navne for spiller 2: ");

                Players[2] = gui.getUserString("Indtast navne for spiller 3: ");

                Players[3] = gui.getUserString("Indtast navne for spiller 4: ");

            }
            return Players;
        }
    }