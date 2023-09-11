package Tutorial.Tutorial2.Dice;

public class Dice {

    private int valueOfDice;

    public Dice() {
        this.valueOfDice = 1;
    }

    public void setDiceValue() {
        // Random the number
        this.valueOfDice = (int) (Math.random() * 6) + 1;
    }

    public int getDiceValue() {
        return this.valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current Value is " + this.valueOfDice);
    }
}
