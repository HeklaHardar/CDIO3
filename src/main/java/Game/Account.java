package Game;

public class Account {

    private int points = 1000;
    private boolean win = false;

    public Account() {
    }

    // Updates player score
    public void updateScore(int sum) {points += sum;}

    // Returns new score
    public int score() {return points;}

    public boolean isWin() {return win;}
}