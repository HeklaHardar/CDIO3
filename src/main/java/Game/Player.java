package Game;

public class Player {

    private int score;
    private int playerPosition = 0;

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

    public int currentPosition(){return playerPosition;}

    public void updatePosition(int position){playerPosition+=position;}

}