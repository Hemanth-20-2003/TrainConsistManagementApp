package com.trainconsistmanagementapp.main;
/**
 * =====================================================================
 * MAIN CLASS - UseCase18TrainConsistMgmnt
 * =====================================================================
 * * Use Case 18: Linear Search for Bogie ID
 * * Description:
 * This class implements a sequential search to locate a specific 
 * bogie ID within an unsorted array.
 * * At this stage, the application:
 * - Traverses an array element-by-element
 * - Compares search keys using String equals()
 * - Implements early termination upon finding a match
 * - Handles "Not Found" scenarios gracefully
 * * This maps fundamental searching logic.
 * * @author Developer
 * @version 18.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("==========================================\n");

        // Step 1: Create an array of unsorted Bogie IDs
        String[] bogieIds = {"BG-104", "BG-101", "BG-105", "BG-103", "BG-102"};
        
        // Step 2: Define the target bogie ID we are looking for
        String searchKey = "BG-105";
        boolean isFound = false;
        int position = -1;

        System.out.println("Searching for Bogie ID: " + searchKey);

        // Step 3: Sequential Traversal
        // We check every index one by one (Linear approach)
        for (int i = 0; i < bogieIds.length; i++) {
            // Equality Comparison using equals() for Strings
            if (bogieIds[i].equals(searchKey)) {
                isFound = true;
                position = i;
                // Early Termination: No need to check remaining bogies
                break; 
            }
        }

        // Step 4: Display the result
        if (isFound) {
            System.out.println("Result: Bogie " + searchKey + " found at Position " + (position + 1));
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found in the consist.");
        }

        System.out.println("\nUC18 search operation completed.");
    }
}