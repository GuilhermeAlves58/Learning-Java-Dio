package problem_set.Collections.map;

import java.util.*;

public class DiceSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> diceResults = new HashMap<>();

        // Initialize the map with values from 1 to 6
        for (int i = 1; i <= 6; i++) {
            diceResults.put(i, 0);
        }

        // Roll the dice 100 times
        for (int i = 0; i < 100; i++) {
            int roll = random.nextInt(6) + 1; // random number from 1 to 6
            diceResults.put(roll, diceResults.get(roll) + 1);
        }

        // Show how many times each number appeared
        System.out.println("Dice roll results (100 times):");
        for (Map.Entry<Integer, Integer> entry : diceResults.entrySet()) {
            System.out.println("Number " + entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}
