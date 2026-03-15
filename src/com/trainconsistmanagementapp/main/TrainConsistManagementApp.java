package com.trainconsistmanagementapp.main;
/**
 * =====================================================================
 * CUSTOM EXCEPTION - InvalidCapacityException
 * =====================================================================
 * Thrown when a bogie is created with a capacity <= 0.
 */
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

/**
 * =====================================================================
 * MAIN CLASS - UseCase14TrainConsistMgmnt
 * =====================================================================
 * * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 * * Description:
 * This class prevents the creation of invalid bogies by enforcing
 * business rules through custom exception handling.
 * * At this stage, the application:
 * - Defines a custom checked exception
 * - Validates data during object construction
 * - Uses 'throw' and 'throws' keywords
 * - Implements a fail-fast validation strategy
 * * This maps domain-specific error handling.
 * * @author Developer
 * @version 14.0
 */
public class TrainConsistManagementApp {

    /**
     * STATIC INNER CLASS - PassengerBogie
     * Validates capacity before allowing object instantiation.
     */
    static class PassengerBogie {
        String name;
        int capacity;

        // Constructor declaring it can throw our custom exception
        public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                // Rule violation detected: Fail fast!
                throw new InvalidCapacityException("Invalid capacity (" + capacity + 
                                                   ") for bogie: " + name + 
                                                   ". Capacity must be greater than zero.");
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " [" + capacity + " seats]";
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==========================================\n");

        // Test Case 1: Attempt to create a valid bogie
        try {
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("SUCCESS: Created " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Test Case 2: Attempt to create an invalid bogie (Negative Capacity)
        try {
            System.out.println("\nAttempting to create invalid bogie...");
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", -10);
            System.out.println("SUCCESS: " + invalidBogie); // This won't run
        } catch (InvalidCapacityException e) {
            // Business rule enforcement in action
            System.err.println("VALIDATION FAILED: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed.");
    }
}