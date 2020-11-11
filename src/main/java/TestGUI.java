import gui_fields.*;
import gui_main.GUI;
import gui_resources.Attrs;

import java.awt.*;

public class TestGUI {
    public TestGUI(){
        // Laver array
        GUI_Field[] fields = new GUI_Field[24];
        Color[] fieldColors = {Color.GREEN,Color.BLUE,Color.PINK,Color.YELLOW,Color.RED, Color.cyan, new Color(34,139,34)};
        String[] fieldTitles = {"Burgerbaren","Pizzariaet","","Slikbutikken","Iskiosken","","Museet","Biblioteket","","Skaterparken",
        "Svømmingpoolen","", "Spillehallen", "Biografen","","Legetøjsbutikken","Dyrehandlen","","Bowlinghallen","Zoo","","Vandlandet"};

        // Laver orange startfelt
        fields[0] = new GUI_Start("Start", "", "Her starter du", Color.ORANGE, Color.WHITE);

        // Fylder resten af feltenre ud med veje
        for( int i=1; i<24; i++) {
            if (i == 3 || i == 9 || i == 15 || i == 21) {
                fields[i] = new GUI_Chance();
            }
            else if(i==6){
                fields[i] = new GUI_Jail();
                fields[i].setSubText("På besøg");
            }
            else if(i==12) {
                fields[i] = new GUI_Refuge();
                fields[i].setSubText("Gratis parkering");
            }
            else if(i==18){
                fields[i] = new GUI_Jail();
                fields[i].setSubText("Gå i fængsel");
            }
            else {

                fields[i] = new GUI_Street(
                        "Street " + i,
                        "Price: " + (i * 50),
                        "This is a street",
                        "100",
                        Color.PINK,
                        Color.WHITE
                );
                if(3>i){
                    fields[i].setBackGroundColor(fieldColors[0]);
                }
                else if(3<i&i<6){
                    fields[i].setBackGroundColor(fieldColors[5]);
                }
                else if(6<i&i<9){
                    fields[i].setBackGroundColor(fieldColors[2]);
                }
                else if(9<i&i<12){
                    fields[i].setBackGroundColor(fieldColors[3]);
                }
                else if(12<i&i<15){
                    fields[i].setBackGroundColor(fieldColors[4]);
                }
                else if(15<i&i<18){
                    fields[i].setBackGroundColor(fieldColors[3]);
                }
                else if(18<i&i<21){
                    fields[i].setBackGroundColor(fieldColors[6]);
                }
                else if(21<i&i<24){
                    fields[i].setBackGroundColor(fieldColors[1]);
                }

            }
        }

        GUI gui = new GUI(fields);
    }
    }

