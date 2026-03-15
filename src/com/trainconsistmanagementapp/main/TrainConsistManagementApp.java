package com.trainconsistmanagementapp.main;
import java.util.ArrayList;
import java.util.List;

/**
 * =====================================================================
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 * =====================================================================
 * * Use Case 12: Safety Compliance Check for Goods Bogies
 * * Description:
 * This class enforces domain safety rules using Stream API terminal
 * operations to ensure cargo is compatible with bogie types.
 * * At this stage, the application:
 * - Validates bogie-cargo compatibility
 * - Uses allMatch() for total consist verification
 * - Applies business logic via Lambda expressions
 * - Prevents hazardous configurations
 * * This maps safety auditing using Streams.
 * * @author Developer
 * @version 12.0
 */
public class TrainConsistManagementApp {

	/**
	 * STATIC INNER CLASS - GoodsBogie
	 * Represents a cargo-carrying unit with a specific shape and payload.
	 */
	static class GoodsBogie {
		String type;  // e.g., Cylindrical, Box, Flatbed
		String cargo; // e.g., Petroleum, Coal, Iron

		GoodsBogie(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
		}

		@Override
		public String toString() {
			return "[" + type + " bogie carrying " + cargo + "]";
		}
	}

	public static void main(String[] args) {

		System.out.println("==========================================");
		System.out.println(" UC12 - Safety Compliance Check ");
		System.out.println("==========================================\n");

		// Step 1: Prepare a list of goods bogies
		List<GoodsBogie> goodsConsist = new ArrayList<>();
		goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
		goodsConsist.add(new GoodsBogie("Box", "Coal"));
		goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
		// Uncomment the line below to test a safety violation:
		// goodsConsist.add(new GoodsBogie("Cylindrical", "Coal")); 

		System.out.println("Current Goods Consist:");
		goodsConsist.forEach(System.out::println);

		// Step 2: Use allMatch() to validate safety rules
		// Rule: If the bogie is "Cylindrical", it MUST carry "Petroleum"
		boolean isSafetyCompliant = goodsConsist.stream().allMatch(b -> {
			if (b.type.equalsIgnoreCase("Cylindrical")) {
				return b.cargo.equalsIgnoreCase("Petroleum");
			}
			return true; // Other types are considered safe for this demo
		});

		// Step 3: Display results
		System.out.println("\n------------------------------------------");
		if (isSafetyCompliant) {
			System.out.println("STATUS: SAFETY COMPLIANT : True");
			System.out.println("The train is cleared for departure.");
		} else {
			System.out.println("STATUS: SAFETY VIOLATION : False");
			System.out.println("Action Required: Check Cylindrical bogie cargo!");
		}
		System.out.println("------------------------------------------");

		System.out.println("\nUC12 safety compliance audit completed.");
	}
}