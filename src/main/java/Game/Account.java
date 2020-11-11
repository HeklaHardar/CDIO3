package Game;

public class Account {

    private int points = 24;

    public Account() {}

    // Updates player score
    public void updateScore(int sum) {points += sum;}

    // Returns new score
    public int score() {return points;}
}