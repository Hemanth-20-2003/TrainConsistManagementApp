package com.trainconsistmanagementapp.main;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =====================================================================
 * MAIN CLASS - UseCase13TrainConsistMgmnt
 * =====================================================================
 * * Use Case 13: Performance Comparison (Loops vs Streams)
 * * Description:
 * This class measures and compares the execution time of traditional
 * loop-based filtering versus modern Stream-based filtering.
 * * At this stage, the application:
 * - Benchmarks code using System.nanoTime()
 * - Compares imperative (Loop) vs declarative (Stream) styles
 * - Provides evidence-based performance insights
 * * This maps performance benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC13 - Performance Comparison ");
        System.out.println("==========================================\n");

        // Step 1: Prepare a large collection of bogies for benchmarking
        List<String> largeTrainConsist = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeTrainConsist.add("Bogie-" + i);
        }

        // --- BENCHMARK 1: Traditional Loop ---
        long startLoop = System.nanoTime();
        List<String> loopResult = new ArrayList<>();
        for (String bogie : largeTrainConsist) {
            if (bogie.contains("5")) { // Arbitrary filter condition
                loopResult.add(bogie);
            }
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        // --- BENCHMARK 2: Stream API ---
        long startStream = System.nanoTime();
        List<String> streamResult = largeTrainConsist.stream()
                .filter(b -> b.contains("5"))
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

        // Step 3: Display Results
        System.out.println("Benchmarking Results (10,000 Bogies):");
        System.out.println("------------------------------------------");
        System.out.println("Loop Duration   : " + loopDuration + " nanoseconds");
        System.out.println("Stream Duration : " + streamDuration + " nanoseconds");
        System.out.println("------------------------------------------");

        if (loopDuration < streamDuration) {
            System.out.println("Result: Traditional Loop was faster in this run.");
        } else {
            System.out.println("Result: Stream API was faster in this run.");
        }

        System.out.println("\nUC13 performance measurement completed.");
    }
}