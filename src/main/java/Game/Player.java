package Game;

public class Player {

    private int score;

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

    //Updates and keeps track of players score
    public int playerBalance(int score){
        account.updateScore(score);
        return account.score();

    }

}