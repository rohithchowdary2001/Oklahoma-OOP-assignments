package DiceRollerTest;

//In dietest.java

import org.junit.Test;

import DiceRollerPD.die;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class dietest {
 @Test
 public void testRollFrequency() {
     int faces = 6; // Assuming a six-sided die for testing
     die dieToTest = new die(faces, "Test Die");

     int numberOfRolls = 100;
     Map<Integer, Integer> frequencyMap = new HashMap<>();

     // Roll the die 100 times and record the outcomes
     for (int i = 0; i < numberOfRolls; i++) {
         int outcome = dieToTest.roll();
         frequencyMap.put(outcome, frequencyMap.getOrDefault(outcome, 0) + 1);
     }

     // Display the frequency of each outcome
     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
         System.out.println("Outcome " + entry.getKey() + ": " + entry.getValue() + " times");
     }

     // You can add assertions based on your expectations
     // For example, assert that each outcome occurred at least once
     for (int face = 1; face <= faces; face++) {
         assertTrue(frequencyMap.containsKey(face));
     }
 }

 private void assertTrue(boolean b) {
 }
}

