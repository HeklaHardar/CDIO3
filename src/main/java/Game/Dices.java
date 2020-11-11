package Game;

public class Dices {

    // Creates two dices
    Die die1 = new Die(6);
    Die die2 = new Die(6);

    // Gets the sum of both dices
    public int sum() {
        return die1.getValue() + die2.getValue();
    }

    // Rolls both dices
    public Dices roll() {
        die1.roll();
        die2.roll();
        return this;
    }

    @Override
    public String toString() {
        return
                die1.getValue() +
                        ", " + die2.getValue();
    }
}