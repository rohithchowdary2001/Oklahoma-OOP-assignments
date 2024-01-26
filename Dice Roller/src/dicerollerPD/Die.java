package dicerollerPD;

import java.util.Random;

public class Die {
    private static int nextId = 1;
    private int id;
    private Random random;

    public Die() {
        this.id = nextId++;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1; // Assuming a standard six-sided die
    }

    public int getId() {
        return id;
    }
}

