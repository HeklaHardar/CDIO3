import gui_fields.*;
import gui_main.GUI;

public class hej {

    public static void main(String[] args) {

        GUI_Player player = new GUI_Player("Mikkel",2000);

        GUI_Field[] fields = {new GUI_Start(),new GUI_Street(),new GUI_Chance(),new GUI_Jail(),new GUI_Shipping(),new GUI_Brewery(), new GUI_Refuge()};

        GUI gui = new GUI(fields);
        GUI_Field[] field = gui.getFields();
    }
}