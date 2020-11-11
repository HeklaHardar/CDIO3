package Game;

public class Account {

    private int points = 1000;
    private boolean win = false;

    public Account() {
    }

    // Updates player score
    public void updateScore(int sum) {

        points += sum;

        if (points < 0) {
            points = 0;
        }

        if (points > 2999) {
            win = true;
        }

        if (sum == 1000)
            points = 1000;


    }

    // Returns new score
    public int score() {
        return points;
    }

    public boolean isWin() {
        return win;
    }
}