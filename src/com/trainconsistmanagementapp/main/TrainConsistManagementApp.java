package com.trainconsistmanagementapp.main;
import java.util.Arrays;

/**
 * =====================================================================
 * MAIN CLASS - UseCase16TrainConsistMgmnt
 * =====================================================================
 * * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)
 * * Description:
 * This class demonstrates manual sorting of bogie capacities without
 * using built-in library methods like Arrays.sort().
 * * At this stage, the application:
 * - Uses an array to store raw capacity data
 * - Implements nested loops for comparison
 * - Performs manual swapping of adjacent elements
 * - Displays the step-by-step sorting result
 * * This maps algorithmic thinking and array manipulation.
 * * @author Developer
 * @version 16.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC16 - Manual Bubble Sort Logic ");
        System.out.println("==========================================\n");

        // Step 1: Initialize an array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 90, 40};

        System.out.println("Initial Capacities: " + Arrays.toString(capacities));

        // Step 2: Implement Bubble Sort Algorithm
        // The outer loop controls the number of passes
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            // The inner loop performs adjacent comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element on the left is greater than the right
                if (capacities[j] > capacities[j + 1]) {
                    // Manual Swapping Logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 3: Display the sorted result
        System.out.println("Sorted Capacities (Manual Sort): " + Arrays.toString(capacities));

        System.out.println("\nUC16 manual sorting algorithm completed.");
    }
}