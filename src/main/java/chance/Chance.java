package chance;

public class Chance {
    private static double SIDE_OF_A_DICE = 6;
    private static double numberOfRolls = 1;
    private final double sideOfADice;

    public Chance() {
       this.sideOfADice = SIDE_OF_A_DICE;
       this.numberOfRolls = numberOfRolls;
    }

    public double calculateProbability() {
        return numberOfRolls / sideOfADice;
    }
}
