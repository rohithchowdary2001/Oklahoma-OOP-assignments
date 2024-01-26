// dicerollerPD/DiceBag.java
package dicerollerPD;

import java.util.ArrayList;
import java.util.List;

public class DiceBag {
    private List<Die> dice;

    public DiceBag() {
        this.dice = new ArrayList<>();
    }

    public void addDice(int numDice, int numFaces) {
        for (int i = 0; i < numDice; i++) {
            dice.add(new Die(numFaces));
        }
    }

    public void rollAllDice() {
        int total = 0;

        for (Die die : dice) {
            int result = die.roll();
            System.out.println("Die " + die.getId() + ", Face: " + result);
            total += result;
        }

        System.out.println("Total of all faces rolled: " + total);
    }

    public int getNumDice() {
        return dice.size();
    }
}
