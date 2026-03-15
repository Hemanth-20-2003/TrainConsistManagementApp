package com.trainconsistmanagementapp.main;
import java.util.Arrays;

/**
 * =====================================================================
 * MAIN CLASS - UseCase19TrainConsistMgmnt
 * =====================================================================
 * * Use Case 19: Binary Search for Bogie ID (Optimized)
 * * Description:
 * This class implements a Divide-and-Conquer search strategy to 
 * find a bogie ID in an O(log n) time complexity.
 * * At this stage, the application:
 * - Requires sorted data as a precondition
 * - Uses low, high, and mid indexes to narrow the search
 * - Employs String.compareTo() for alphabetical navigation
 * - Provides ultra-fast lookups for large train consists
 * * This maps optimized searching algorithms.
 * * @author Developer
 * @version 19.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC19 - Binary Search (Divide & Conquer) ");
        System.out.println("==========================================\n");

        // Step 1: Precondition - The data MUST be sorted
        String[] bogieIds = {"BG-101", "BG-102", "BG-103", "BG-104", "BG-105"};
        String searchKey = "BG-104";

        System.out.println("Sorted IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for: " + searchKey + "\n");

        // Step 2: Initialize Binary Search Variables
        int low = 0;
        int high = bogieIds.length - 1;
        int resultIndex = -1;

        // Step 3: Binary Search Logic
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid index safely

            // compareTo() returns:
            // 0 if equal
            // < 0 if searchKey is smaller (go left)
            // > 0 if searchKey is larger (go right)
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                resultIndex = mid;
                break; // Found it!
            } else if (comparison < 0) {
                high = mid - 1; // Discard right half
            } else {
                low = mid + 1; // Discard left half
            }
        }

        // Step 4: Display Result
        if (resultIndex != -1) {
            System.out.println("MATCH FOUND ✅");
            System.out.println("Bogie " + searchKey + " located at position: " + (resultIndex + 1));
        } else {
            System.out.println("MATCH NOT FOUND ❌");
            System.out.println("Bogie ID " + searchKey + " does not exist in this consist.");
        }

        System.out.println("\nUC19 optimized search operation completed.");
    }
}