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


    public void setInPrison(){
            inPrison = true;
            position = 6;
    }
    public boolean isInPrison(){
        return inPrison;
    }
    public void releaseFromPrison(boolean inPrison){
        if(inPrison && prisonCard){
            this.inPrison = false;
            prisonCard = false;
        }
        else if(inPrison) {
            account.updateScore(-1);
            this.inPrison = false;
        }
    }
    public void updatePrisonCard(boolean Card){
        prisonCard = Card;
    }

    public boolean checkPrisonCard(){
        return prisonCard;
    }
    public int currentPosition(){
        return position;
    }
    public int setPosition(int newPosition){
        position = newPosition;
        return position;
    }
    public int updatePosition(int die){
        position += die;
        if(die == 900) {
            position = 0;
            account.updateScore(2);
        }
        else if(die == 800){
            position = 23;
        }
        else if(die == 700){
            if (currentPosition() > 10)
                account.updateScore(2);
            position = 10;

        }
        else if(position > 23){
            position = position - 24;
            account.updateScore(2);
        }
        return position;
    }

}