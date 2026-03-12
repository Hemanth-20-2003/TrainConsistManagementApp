package com.trainconsistmanagementapp.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * =====================================================================
 * MAIN CLASS - UseCase9TrainConsistMgmnt
 * =====================================================================
 * * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 * * Description:
 * This class demonstrates how to categorize train bogies into 
 * groups using Stream collectors.
 * * At this stage, the application:
 * - Creates a list of bogie objects
 * - Transforms the flat list into a Map using groupingBy
 * - Categorizes bogies by their name/type
 * - Displays the structured result
 * * This maps hierarchical data organization using Streams.
 * * @author Developer
 * @version 9.0
 */
public class TrainConsistManagementApp {

    // Reusing the static inner class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Getter for grouping logic
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "[Name=" + name + ", Cap=" + capacity + "]";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("==========================================\n");

        // Step 1: Create a list with multiple bogies of the same type
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("AC Chair", 56));

        System.out.println("Flat Train Consist List:");
        trainConsist.forEach(System.out::println);

        // Step 2: Group bogies by their name using groupingBy
        // This produces a Map where the Key is the Bogie name 
        // and the Value is a List of all bogies of that type
        Map<String, List<Bogie>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Step 3: Display the structured grouping
        System.out.println("\nStructured Bogie Report (Grouped by Type):");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: " + type + " -> Count: " + list.size() + " " + list);
        });

        System.out.println("\nUC9 data categorization completed successfully...");
    }
}