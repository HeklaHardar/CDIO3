import gui_fields.*;
import gui_main.GUI;
import Game.CardPicker;
import Game.Menu;

public class hej {

    public static void main(String[] args) {

        Menu menu1 = new Menu();



        CardPicker card = new CardPicker();
        card.CardScrambler();
        GUI_Player player = new GUI_Player("Mikkel",2000);
        GUI_Field[] fields = {new GUI_Start(),new GUI_Street(),new GUI_Chance(),new GUI_Jail(),new GUI_Shipping(),new GUI_Brewery(), new GUI_Refuge()};


        GUI gui = new GUI();
       // GUI_Field[] field = gui.getFields();
        gui.showMessage(menu1.getPlayer1());
    }
}