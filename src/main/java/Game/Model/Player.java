package Game.Model;

public class Player {

    private boolean prisonCard = false;
    private int position = 0;
    private boolean inPrison = false;


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

    // put player in prison
    public void setInPrison(){
            inPrison = true;
            position = 6;
    }
    // is player in prison?
    public boolean isInPrison(){
        return inPrison;
    }
    // release player from prison
    public void releaseFromPrison(boolean inPrison){
        if(inPrison && prisonCard){
            this.inPrison = false;
        }
        else if(inPrison) {
            account.updateScore(-1);
            this.inPrison = false;
        }
    }
    // Does the player have a get out of jail free card?
    public boolean checkPrisonCard(){
        return prisonCard;
    }
    // Check where player is currently
    public int currentPosition(int i, int i1){
        return position;
    }
    // Move player with die
    public int updatePosition(int die){
        position += die;
        if(position > 23){
            position = position - 24;
            account.updateScore(2);
        }
        return position;
    }

}