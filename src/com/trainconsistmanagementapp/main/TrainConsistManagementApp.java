package com.trainconsistmanagementapp.main;
import java.util.Arrays;

/**
 * =====================================================================
 * MAIN CLASS - UseCase17TrainConsistMgmnt
 * =====================================================================
 * * Use Case 17: Sort Bogie Names Using Arrays.sort()
 * * Description:
 * This class demonstrates alphabetical sorting of bogie types
 * using Java's highly optimized built-in utility methods.
 * * At this stage, the application:
 * - Utilizes Arrays.sort() for efficient processing
 * - Leverages Natural Ordering (Alphabetical) for Strings
 * - Reduces code verbosity and potential for manual errors
 * - Highlights the shift from O(n²) to O(n log n) efficiency
 * * This maps library-optimized data organization.
 * * @author Developer
 * @version 17.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC17 - Optimized Alphabetical Sorting ");
        System.out.println("==========================================\n");

        // Step 1: Initialize an array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Cargo", "Pantry"};

        System.out.println("Initial Bogie Order:");
        System.out.println(Arrays.toString(bogieTypes));

        // Step 2: Use the built-in Arrays.sort() method
        // No manual loops or swap logic required. 
        // Java handles the comparison and movement internally.
        Arrays.sort(bogieTypes);

        // Step 3: Display the sorted result
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("\nUC17 optimized sorting completed successfully.");
    }
}