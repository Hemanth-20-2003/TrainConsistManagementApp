package com.trainconsistmanagementapp.main;
import java.util.ArrayList;
import java.util.List;

/**
 * =====================================================================
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 * =====================================================================
 * * Use Case 10: Count Total Seats in Train (reduce)
 * * Description:
 * This class aggregates seating capacities from all bogies into
 * a single total value using Stream reduction.
 * * At this stage, the application:
 * - Extracts capacity values from bogie objects
 * - Reduces multiple numeric values into a single sum
 * - Provides quantitative insight for planning
 * * This maps functional aggregation using reduce.
 * * @author Developer
 * @version 10.0
 */
public class TrainConsistManagementApp {

    // Reusing the static inner class for consistency
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("==========================================\n");

        // Step 1: Initialize the train consist with various bogies
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("General", 90));

        System.out.println("Train Consist Details:");
        trainConsist.forEach(System.out::println);

        // Step 2: Use map() to get capacities and reduce() to sum them
        // map() transforms Bogie objects -> Integer values
        // reduce(identity, accumulator) combines them into one result
        int totalCapacity = trainConsist.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 3: Display the final aggregated metric
        System.out.println("\n------------------------------------------");
        System.out.println("TOTAL SEATING CAPACITY : " + totalCapacity);
        System.out.println("------------------------------------------");

        System.out.println("\nUC10 aggregation and numeric analytics completed.");
    }
}