package com.trainconsistmanagementapp.main;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * =====================================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * =====================================================================
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 * * Description:
 * This class sorts passenger bogies based on their seating 
 * capacity using a custom Comparator.
 * * At this stage, the application:
 * - Creates Bogie objects
 * - Stores them in a List
 * - Applies custom sorting logic
 * - Displays ranked bogie information
 * * This maps custom object sorting using Comparator.
 * * @author Developer
 * @version 7.0
 */
public class TrainConsistManagementApp {

    /**
     * STATIC INNER CLASS - Bogie
     * Keeps the Bogie definition local to the Management App.
     */
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
        System.out.println(" UC7 - Sort Bogies by Capacity (Inner Class) ");
        System.out.println("==========================================\n");

        List<Bogie> passengerBogies = new ArrayList<>();

        // We can now instantiate Bogie directly within the main class
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));


        System.out.println("Before Sorting Train Consist (by Capacity):");
        passengerBogies.forEach(System.out::println);
        // Sort by capacity using a Comparator
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n\nSorted Train Consist (by Capacity):");
        passengerBogies.forEach(System.out::println);
        
    }
}