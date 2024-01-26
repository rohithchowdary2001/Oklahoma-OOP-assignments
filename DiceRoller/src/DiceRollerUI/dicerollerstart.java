package DiceRollerUI;

//In dicerollerstart.java

import DiceRollerPD.dicebag;
import DiceRollerPD.die;
import DiceRollerTest.dietest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class dicerollerstart {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Prompt user for the number of dice
     System.out.print("Enter the number of dice: ");
     int numberOfDice = scanner.nextInt();

     // Prompt user for the number of faces for all dice
     System.out.print("Enter the number of faces for all dice: ");
     int numberOfFaces = scanner.nextInt();

     // Prompt user for the number of throws
     System.out.print("Enter the number of throws: ");
     int numberOfThrows = scanner.nextInt();

     // Create a list of dice
     List<die> dice = new ArrayList<>();
     for (int i = 1; i <= numberOfDice; i++) {
         dice.add(new die(numberOfFaces, "Die " + i));
     }

     // Create a dicebag with the specified dice and faces
     dicebag diceBag = new dicebag(dice, numberOfFaces);

     // Roll the dice and display outcomes
     diceBag.rollDice(numberOfDice, numberOfThrows);

     // Run the test with the same dice configuration for 100 times
     runTest(numberOfFaces, numberOfDice, 100);

     // Close the scanner
     scanner.close();
 }

 private static void runTest(int numberOfFaces, int numberOfDice, int numberOfRuns) {
     Map<Integer, Integer> frequencyMap = new HashMap<>();

     for (int run = 0; run < numberOfRuns; run++) {
         int throwTotal = 0;

         for (int dieNumber = 1; dieNumber <= numberOfDice; dieNumber++) {
             throwTotal += (int) (Math.random() * numberOfFaces) + 1;
         }

         frequencyMap.put(throwTotal, frequencyMap.getOrDefault(throwTotal, 0) + 1);
     }

     // Display the frequency of each outcome
     System.out.println("Frequency of Outcomes for 100 runs:");
     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
         System.out.println("Outcome " + entry.getKey() + ": " + entry.getValue() + " times");
     }
 }
}






//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//public class dicerollerstart {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//
//     // Prompt user for the number of dice
//     System.out.print("Enter the number of dice: ");
//     int numberOfDice = scanner.nextInt();
//
//     // Prompt user for the number of throws
//     System.out.print("Enter the number of throws: ");
//     int numberOfThrows = scanner.nextInt();
//
//     // Create a list of dice
//     List<die> dice = new ArrayList<>();
//     for (int i = 1; i <= numberOfDice; i++) {
//         dice.add(new die(0, "Die " + i)); // Faces will be set later
//     }
//
//     // Create a dicebag with the specified dice
//     dicebag diceBag = new dicebag(dice);
//
//     // Roll the dice and display outcomes
//     diceBag.rollDice(numberOfDice, numberOfThrows);
//
//     // Close the scanner
//     scanner.close();
// }
//}
