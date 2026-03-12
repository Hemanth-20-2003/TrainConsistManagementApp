package com.trainconsistmanagementapp.main;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =====================================================================
 * MAIN CLASS - UseCase8TrainConsistMgmnt
 * =====================================================================
 * * Use Case 8: Filter Passenger Bogies Using Streams
 * * Description:
 * This class demonstrates how to filter bogies based on 
 * seating capacity using the Java Stream API.
 * * At this stage, the application:
 * - Creates a list of bogies
 * - Uses a Stream pipeline to filter data
 * - Applies a lambda condition (capacity > 60)
 * - Collects and displays the results
 * * This maps declarative data processing using Streams.
 * * @author Developer
 * @version 8.0
 */
public class TrainConsistManagementApp {

    // Reusing the static inner class from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC8 - Filter Bogies Using Streams ");
        System.out.println("==========================================\n");

        // Step 1: Create the list of bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("All Available Bogies:");
        passengerBogies.forEach(System.out::println);

        // Step 2: Use Stream API to filter high-capacity bogies
        // filter() defines the condition, collect() gathers the result
        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display the filtered result
        System.out.println("\nHigh-Capacity Bogies (Capacity > 60):");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        System.out.println("\nUC8 stream filtering completed successfully...");
    }
}