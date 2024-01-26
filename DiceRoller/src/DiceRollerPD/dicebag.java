//package DiceRollerPD;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class dicebag {
//    private List<die> dice;
//
//    public dicebag(List<die> dice) {
//        this.dice = dice;
//    }
//
//    public void rollDice(int numberOfDice, int numberOfThrows) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int totalThrows = 0;
//        int totalOutcomes = 0;
//
//        // Prompt user for the number of faces for all dice
//        System.out.print("Enter the number of faces for all dice: ");
//        int faces = scanner.nextInt();
//
//        for (int throwNumber = 1; throwNumber <= numberOfThrows; throwNumber++) {
//            System.out.println("Throw " + throwNumber + ":");
//
//            int throwTotal = 0;
//
//            for (int dieNumber = 1; dieNumber <= numberOfDice; dieNumber++) {
//                int outcome = random.nextInt(faces) + 1;
//                throwTotal += outcome;
//                System.out.println("Die " + dieNumber + ": " + outcome);
//            }
//
//            totalThrows += throwTotal;
//            totalOutcomes += throwTotal;
//
//            System.out.println("Total for Throw " + throwNumber + ": " + throwTotal);
//            System.out.println(); // Empty line between throws
//        }
//
//        System.out.println("Total Throws: " + totalThrows);
//        System.out.println("Total of Totals: " + totalOutcomes);
//
//        // Close the scanner
//        scanner.close();
//    }
//}




// In DiceRollerPD.dicebag.java

// In DiceRollerPD.dicebag.java

//package DiceRollerPD;
//
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class dicebag {
//    private List<die> dice;
//    private int numberOfFaces;
//
//    public dicebag(List<die> dice, int numberOfFaces) {
//        this.dice = dice;
//        this.numberOfFaces = numberOfFaces;
//    }
//
//    public void rollDice(int numberOfDice, int numberOfThrows) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int totalThrows = 0;
//
//        for (int throwNumber = 1; throwNumber <= numberOfThrows; throwNumber++) {
//            System.out.println("Throw " + throwNumber + ":");
//
//            int throwTotal = 0;
//
//            for (int dieNumber = 1; dieNumber <= numberOfDice; dieNumber++) {
//                die currentDie = dice.get(dieNumber - 1);
//                int outcome = random.nextInt(numberOfFaces) + 1;
//                throwTotal += outcome;
//                System.out.println(currentDie.getName() + ": " + outcome);
//            }
//
//            totalThrows += throwTotal;
//
//            System.out.println("Total for Throw " + throwNumber + ": " + throwTotal);
//            System.out.println(); // Empty line between throws
//        }
//
//        System.out.println("Total Throws: " + totalThrows);
//
//        // Close the scanner
//        scanner.close();
//    }
//}






// In DiceRollerPD.dicebag.java

package DiceRollerPD;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class dicebag {
    private List<die> dice;
    private int numberOfFaces;

    public dicebag(List<die> dice, int numberOfFaces) {
        this.dice = dice;
        this.numberOfFaces = numberOfFaces;
    }

    public void rollDice(int numberOfDice, int numberOfThrows) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalThrows = 0;

        for (int throwNumber = 1; throwNumber <= numberOfThrows; throwNumber++) {
            System.out.println("Throw " + throwNumber + ":");

            int throwTotal = 0;

            for (int dieNumber = 1; dieNumber <= numberOfDice; dieNumber++) {
                die currentDie = dice.get(dieNumber - 1);
                int outcome = currentDie.roll();
                throwTotal += outcome;
                System.out.println(currentDie.getName() + ": " + outcome);
            }

            totalThrows += throwTotal;

            System.out.println("Total for Throw " + throwNumber + ": " + throwTotal);
            System.out.println(); // Empty line between throws
        }

        System.out.println("Total Throws: " + totalThrows);

        // Close the scanner
        scanner.close();
    }
}
