package com.trainconsistmanagementapp.main;
import java.util.ArrayList;
import java.util.List;

/**
 * =====================================================================
 * MAIN CLASS - UseCase20TrainConsistMgmnt
 * =====================================================================
 * * Use Case 20: Exception Handling During Search Operations
 * * Description:
 * This class demonstrates defensive programming by ensuring the 
 * system state is valid before performing search operations.
 * * At this stage, the application:
 * - Checks if the bogie collection is empty
 * - Throws IllegalStateException for invalid states
 * - Implements the Fail-Fast principle
 * - Provides meaningful feedback to the operator
 * * This maps state validation and defensive coding.
 * * @author Developer
 * @version 20.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC20 - Defensive Search Validation ");
        System.out.println("==========================================\n");

        // Scenario: An empty train consist
        List<String> emptyConsist = new ArrayList<>();
        String searchTarget = "BG-101";

        System.out.println("Attempting to search in the train formation...");

        try {
            // Step 1: Perform Defensive Validation
            performSearch(emptyConsist, searchTarget);
            
        } catch (IllegalStateException e) {
            // Step 2: Handle the invalid state gracefully
            System.err.println("SEARCH ABORTED: " + e.getMessage());
        }

        System.out.println("\nUC20 state validation completed.");
    }

    /**
     * Searches for a bogie but validates system state first.
     * @throws IllegalStateException if the list is empty
     */
    public static void performSearch(List<String> consist, String key) {
        // Defensive Check: Fail-Fast if the train is empty
        if (consist == null || consist.isEmpty()) {
            throw new IllegalStateException("The train consist is currently empty. Add bogies before searching.");
        }

        // Search logic would go here if state was valid
        System.out.println("Searching for " + key + "...");
    }
}