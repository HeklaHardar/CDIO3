package Game;

public class CurrentPlayer {
    private int min = 0;
    private int max = 2;
    private int PlayerStarter = (int) (Math.random() * (max - min) + min);
    private int currentPlayer = PlayerStarter;

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}