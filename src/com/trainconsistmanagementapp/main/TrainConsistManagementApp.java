package com.trainconsistmanagementapp.main;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =====================================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * =====================================================================
 * * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 * * Description:
 * This class ensures data integrity by validating input formats
 * using Regular Expressions (Pattern and Matcher).
 * * At this stage, the application:
 * - Compiles regex patterns for Train IDs and Cargo Codes
 * - Uses Matcher to verify input strings
 * - Enforces strict business rules for naming conventions
 * - Prevents malformed data from entering the consist
 * * This maps input validation using Regex.
 * * @author Developer
 * @version 11.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==========================================\n");

        // Step 1: Define Regex Patterns
        // TRN-\\d{4} expects "TRN-" followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET-[A-Z]{2} expects "PET-" followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Step 2: Compile Patterns
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);
        Scanner sc=new Scanner(System.in);
        // Step 3: Test Inputs
        System.out.println("Enter Train ID - (format TRN-1234)");
        String inputTrainId =sc.nextLine();
        System.out.println("Enter Cargo ID - (format PET-AB)");
        String inputCargoCode = sc.nextLine(); 

        // Step 4: Validate Using Matcher
        validateInput("Train ID", inputTrainId, trainIdPattern);
        validateInput("Cargo Code", inputCargoCode, cargoCodePattern);

        System.out.println("\nUC11 validation logic completed.");
    }

    /**
     * Helper method to validate and print results
     */
    private static void validateInput(String label, String input, Pattern pattern) {
        Matcher matcher = pattern.matcher(input);
        
        System.out.print("Validating " + label + ": [" + input + "] -> ");
        
        if (matcher.matches()) {
            System.out.println("VALID ✅");
        } else {
            System.out.println("INVALID ❌ (Does not match required format)");
        }
    }
}