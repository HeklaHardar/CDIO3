import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;

public class JuniorGui {
    public void setupBoard(){
        gui_main.GUI gui = new gui_main.GUI();

        GUI_Player player2 = new GUI_Player("Lau", 2000);
        gui.addPlayer(player2);
        GUI_Field f1 = gui.getFields()[15];
        f1.setTitle("Suck my Chubby nuts :)");
        f1.setDescription("Chubby Nuts in your faces :)");
        GUI_Ownable ownable = (GUI_Ownable) f1;
        ownable.setOwnerName("Albert");
        gui.setDie(6);
        String stringInput = gui.getUserString("Enter some text");
        System.out.println(stringInput);
    }
}
