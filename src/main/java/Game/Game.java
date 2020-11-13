package Game;

public class Game {

    private String Yngst;
    private String[] Tur = new String[4];
    private Player[] player = new Player[4];


    public void Game(){


        CardPicker cardPicker = new CardPicker();
       // JuniorGui juniorGui = JuniorGui.getInstance();
        JuniorGui juniorGui = new JuniorGui();

        Menu menu = new Menu();
        menu.startGame(juniorGui);
        cardPicker.toStringTest(juniorGui);


        for(int i = 0; i <= menu.getPlayerAmount()-1; i++){
            player[i] = new Player(menu.playernamesToString()[i]);
            player[i].starterScore(menu.getPlayerAmount());
            juniorGui.guiPlayers(player[i].playerString(),player[i].playerBalance(),i);
            juniorGui.setCars(i);

            // juniorGui.gui.showMessage(player[i].playerString() + " " + player[i].playerBalance());
        }




        while(true);
        /* Skal måske bruges til at bestemme den yngste spiller
        switch(menu.getPlayerAmount()){
            case 2:
               Yngst = juniorGui.gui.getUserSelection("Hvem er yngst?", player[0].playerString(),player[1].playerString());
                break;
            case 3:
               Yngst = juniorGui.gui.getUserSelection("Hvem er yngst?", player[0].playerString(),player[1].playerString(),player[2].playerString());
                break;
            case 4:
               Yngst = juniorGui.gui.getUserSelection("Hvem er yngst?", player[0].playerString(),player[1].playerString(),player[2].playerString(),player[3].playerString());
                break;
        }*/






    }


}
