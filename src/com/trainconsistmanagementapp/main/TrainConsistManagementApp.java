package com.trainconsistmanagementapp.main;
/**
 * =====================================================================
 * CUSTOM RUNTIME EXCEPTION - CargoSafetyException
 * =====================================================================
 * An unchecked exception thrown when unsafe cargo-bogie combinations 
 * are attempted during runtime operations.
 */
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

/**
 * =====================================================================
 * MAIN CLASS - UseCase15TrainConsistMgmnt
 * =====================================================================
 * * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 * * Description:
 * This class handles unsafe operational assignments without crashing
 * the application by using structured exception handling.
 * * At this stage, the application:
 * - Implements a runtime safety check
 * - Catches domain-specific exceptions
 * - Uses the finally block for mandatory logging
 * - Demonstrates graceful recovery from errors
 * * This maps operational resilience using try-catch-finally.
 * * @author Developer
 * @version 15.0
 */
public class TrainConsistManagementApp {

    /**
     * STATIC INNER CLASS - GoodsBogie
     * Represents a cargo unit that validates assignments at runtime.
     */
    static class GoodsBogie {
        String shape; // e.g., Cylindrical, Rectangular
        String assignedCargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        /**
         * Assigns cargo while enforcing safety rules.
         * Throws CargoSafetyException if the combination is hazardous.
         */
        public void assignCargo(String cargo) {
            System.out.println("Initiating assignment: [" + cargo + "] to [" + shape + "] bogie...");
            
            // Rule: Petroleum cannot be carried in a Rectangular bogie (Leak/Fire risk)
            if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("SAFETY ALERT: Cannot assign Petroleum to a Rectangular bogie!");
            }
            
            this.assignedCargo = cargo;
            System.out.println("Assignment Successful: Cargo updated to " + cargo);
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC15 - Safe Cargo Assignment Operations ");
        System.out.println("==========================================\n");

        GoodsBogie storageBogie = new GoodsBogie("Rectangular");

        // Use try-catch-finally to manage the dangerous assignment
        try {
            // Attempting a hazardous assignment
            storageBogie.assignCargo("Petroleum");
            
        } catch (CargoSafetyException e) {
            // Catch the specific domain error and provide feedback
            System.err.println("OPERATIONAL ERROR: " + e.getMessage());
            System.err.println("Action Denied: Reverting to previous safety state.");
            
        } finally {
            // This block runs regardless of success or failure
            System.out.println("LOG: Cargo assignment attempt processed. System state synchronized.");
        }

        System.out.println("\n------------------------------------------");
        System.out.println("Program continues: System is still stable.");
        System.out.println("------------------------------------------");
    }
}