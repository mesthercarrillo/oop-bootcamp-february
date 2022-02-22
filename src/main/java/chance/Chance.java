package chance;

public class Chance {
    private static double SIDE_OF_A_DICE = 6;
    private static double SIDE_OF_A_DICE_THAT_ARE_NOT_SIX = 5;
    private static double SIDE_OF_A_DICE_THAT_ARE_SIX = 1;
    private final double sidesOfADicesThatAreSix;
    private final double sidesOfADicesThatNotAreSix;
    private final double sidesOfADices;

    public Chance() {
       this.sidesOfADices = SIDE_OF_A_DICE;
       this.sidesOfADicesThatAreSix = SIDE_OF_A_DICE_THAT_ARE_SIX;
       this.sidesOfADicesThatNotAreSix = SIDE_OF_A_DICE_THAT_ARE_NOT_SIX;
    }

    public double calculateProbability() {
        return calculateTheDiceThing() / sidesOfADices;
    }

    private double calculateTheDiceThing() {

    }
}
