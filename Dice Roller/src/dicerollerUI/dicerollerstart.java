// dicerollerPD/DiceRoller.java
package dicerollerUI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import dicerollerPD.DiceBag;

public class dicerollerstart {
    public static void main(String[] args) {
        // AC #4
        displayRollScreen();

        // AC #5
        rollDiceForAC5();

        // AC #6
        calculateTotalForAC6();

        // AC #7
        errorHandlingForAC7();

        // AC #8
        errorHandlingForAC8();
    }

    // AC #4
    public static void displayRollScreen() {
        System.out.println("\nRolling Dice - Enter the number of dice and faces:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dice: ");
        int numDice = scanner.nextInt();

        System.out.print("Enter the number of faces for each die: ");
        int numFaces = scanner.nextInt();

        rollDice(numDice, numFaces);
    }

    // AC #5
    public static void rollDiceForAC5() {
        System.out.println("\nRolling Dice - Enter the number of dice and faces:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dice: ");
        int numDice = scanner.nextInt();

        System.out.print("Enter the number of faces for each die: ");
        int numFaces = scanner.nextInt();

        rollDice(numDice, numFaces);
    }

    private static void rollDice(int numDice, int numFaces) {
        if (numDice <= 0 || numFaces <= 0) {
            System.out.println("Error: Number of dice and faces must be greater than 0.");
            return;
        }

        DiceBag diceBag = new DiceBag();
        diceBag.addDice(numDice, numFaces);
        diceBag.rollAllDice();
    }

    // AC #6
    public static void calculateTotalForAC6() {
        System.out.println("\nCalculate Total - Enter the number of dice and faces:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dice: ");
        int numDice = scanner.nextInt();

        System.out.print("Enter the number of faces for each die: ");
        int numFaces = scanner.nextInt();

        calculateTotal(numDice, numFaces);
    }

    private static void calculateTotal(int numDice, int numFaces) {
        if (numDice <= 0 || numFaces <= 0) {
            System.out.println("Error: Number of dice and faces must be greater than 0.");
            return;
        }

        DiceBag diceBag = new DiceBag();
        diceBag.addDice(numDice, numFaces);
        diceBag.rollAllDice();
    }

    // AC #7
    public static void errorHandlingForAC7() {
        System.out.println("\nError Handling for AC #7:");
        calculateTotal(-2, 6);
    }

    // AC #8
    public static void errorHandlingForAC8() {
        System.out.println("\nError Handling for AC #8:");
        calculateTotal(2, -6);
    }
}
