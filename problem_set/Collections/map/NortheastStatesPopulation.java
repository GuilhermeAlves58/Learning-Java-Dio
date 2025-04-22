package problem_set.Collections.map;

import java.util.*;

public class NortheastStatesPopulation {
    public static void main(String[] args) {
        // Create dictionary of states and populations (in insertion order)
        Map<String, Integer> statesPopulation = new LinkedHashMap<>();
        statesPopulation.put("PE", 9616621);
        statesPopulation.put("AL", 3351543);
        statesPopulation.put("CE", 9187103);
        statesPopulation.put("RN", 3534265);

        // Replace RN population
        statesPopulation.put("RN", 3534165);

        // Check if PB exists, if not, add it
        if (!statesPopulation.containsKey("PB")) {
            statesPopulation.put("PB", 4039277);
        }

        // Show PE population
        System.out.println("PE population: " + statesPopulation.get("PE"));

        // Show all states and populations in insertion order
        System.out.println("\nStates and populations (insertion order):");
        for (Map.Entry<String, Integer> entry : statesPopulation.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Show all states and populations in alphabetical order
        Map<String, Integer> statesPopulationSorted = new TreeMap<>(statesPopulation);
        System.out.println("\nStates and populations (alphabetical order):");
        for (Map.Entry<String, Integer> entry : statesPopulationSorted.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Find state with smallest population
        String smallestState = null;
        int smallestPopulation = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : statesPopulation.entrySet()) {
            if (entry.getValue() < smallestPopulation) {
                smallestPopulation = entry.getValue();
                smallestState = entry.getKey();
            }
        }
        System.out.println("\nState with smallest population: " + smallestState + " - " + smallestPopulation);

        // Find state with largest population
        String largestState = null;
        int largestPopulation = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : statesPopulation.entrySet()) {
            if (entry.getValue() > largestPopulation) {
                largestPopulation = entry.getValue();
                largestState = entry.getKey();
            }
        }
        System.out.println("State with largest population: " + largestState + " - " + largestPopulation);

        // Sum of all populations
        int populationSum = 0;
        for (int population : statesPopulation.values()) {
            populationSum += population;
        }
        System.out.println("\nTotal population: " + populationSum);

        // Average population
        double averagePopulation = (double) populationSum / statesPopulation.size();
        System.out.println("Average population: " + averagePopulation);

        // Remove states with population less than 4,000,000
        Iterator<Map.Entry<String, Integer>> iterator = statesPopulation.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 4000000) {
                iterator.remove();
            }
        }
        System.out.println("\nStates with population >= 4,000,000:");
        for (Map.Entry<String, Integer> entry : statesPopulation.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Clear the dictionary
        statesPopulation.clear();

        // Check if the dictionary is empty
        System.out.println("\nIs the map empty? " + statesPopulation.isEmpty());
    }
}

