package Game;

public class Player {

    private boolean prisonCard = false;


    // Determines variables
    Account account = new Account();
    private String Player;

    // Gets the player's name
    public Player(String s) {
        Player = s;
    }

    public String playerString() {
        return Player;
    }

    //Keeps track of the currentplayers score
    public int playerBalance(){return account.score();}

    //Updates the currentplayers score
    public void playerBalanceUpdate(int update){account.updateScore(update);}

    public void starterScore(int players){account.initializeScore(players);}

    public void hasPrisonCard(){
        prisonCard = true;
    }

    public boolean checkPrisonCard(){
        return prisonCard;
    }

}