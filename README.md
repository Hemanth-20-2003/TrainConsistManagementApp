# TrainConsistManagementApp
## UC1: Initialize Train and Display Consist Summary
This use case initializes the Train Consist Management application and displays the initial state of the train formation. The program starts from the `main()` method, prints a welcome message, and creates an empty `ArrayList` to store train bogies. Since no bogies are added initially, the system displays the starting bogie count using the `size()` method. This use case introduces the concept of application startup flow and demonstrates why dynamic collections like `ArrayList` are useful instead of fixed-size arrays.

## UC2: Add Passenger Bogies to Train (ArrayList Operations)
This use case demonstrates how passenger bogies can be dynamically added and removed using `ArrayList` operations. Bogies such as Sleeper, AC Chair, and First Class are inserted into the list using the `add()` method. The program then removes a bogie using the `remove()` method and checks whether a specific bogie exists using the `contains()` method. This shows how `ArrayList` supports dynamic CRUD operations while preserving insertion order, making it suitable for managing train components that may frequently change.

## UC3: Track Unique Bogie IDs (Set – HashSet)
This use case ensures that duplicate bogie IDs cannot exist in the system. A `HashSet` is used to store bogie identifiers because sets automatically prevent duplicates. When duplicate IDs are intentionally added, the `HashSet` ignores them, keeping only unique values. This demonstrates how `Set` collections enforce uniqueness and protect the system from data inconsistencies that could occur if two bogies were accidentally assigned the same ID.

## UC4: Maintain Ordered Bogie IDs (LinkedList)
This use case models the physical sequence of train bogies using a `LinkedList`. Unlike arrays or simple sets, `LinkedList` stores elements as connected nodes, allowing efficient insertion and removal from the beginning, middle, or end of the train formation. Bogies such as Engine, Sleeper, AC, Cargo, and Guard are added, a Pantry Car is inserted in the middle, and the first and last bogies are removed. This approach closely represents how real train consist formations are modified in railway systems.

## UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
This use case introduces `LinkedHashSet` to maintain both uniqueness and insertion order of bogies in the train formation. Bogies are added to the set, and when a duplicate bogie is inserted, it is automatically ignored. Unlike `HashSet`, `LinkedHashSet` preserves the order in which bogies were attached, ensuring that the printed train formation reflects the real physical attachment sequence. This demonstrates how Java collections can combine ordering and uniqueness in a single structure.

## UC6: Map Bogie to Capacity (HashMap)
This use case associates each bogie with its seating or load capacity using a `HashMap`. The bogie name acts as the key, while its capacity acts as the value. Using the `put()` method, capacities for bogies such as Sleeper, AC Chair, and First Class are stored in the map. The program then iterates through the map using `entrySet()` to display each bogie along with its capacity. This demonstrates key–value data modeling and shows how maps allow fast lookup of attributes related to specific train components.

## UC7: Sort Bogies by Capacity (Comparator)
This use case demonstrates sorting bogie objects based on seating capacity using a `Comparator`. Bogies are represented as custom objects and stored in a list. The `Comparator` defines custom comparison logic so that bogies can be arranged in ascending order of capacity, improving planning and reporting capabilities.

## UC8: Filter Passenger Bogies Using Streams
This use case introduces the Java Stream API to filter bogies based on capacity conditions. The bogie list is converted into a stream, and the `filter()` operation selects bogies that satisfy a defined rule. The filtered results are collected into a new list, demonstrating concise and readable data processing.

## UC9: Group Bogies by Type (Collectors.groupingBy)
This use case groups bogies into categories using `Collectors.groupingBy()`. The stream pipeline classifies bogies based on a selected property and stores them in a `Map` where each key represents a category and the value is a list of bogies belonging to that group. This transformation converts flat data into structured groups useful for reporting.

## UC10: Count Total Seats in Train (reduce)
This use case calculates the total seating capacity of the train using stream aggregation. The bogie list is converted to a stream, capacities are extracted using `map()`, and `reduce()` is applied to compute the total sum. This demonstrates functional-style aggregation and provides operational metrics.

## UC11: Validate Train ID & Cargo Codes (Regex)
This use case validates user input formats using regular expressions. The `Pattern` and `Matcher` classes are used to verify whether Train IDs and Cargo Codes match predefined patterns. This ensures only correctly formatted data enters the system and protects downstream operations from invalid input.

## UC12: Safety Compliance Check for Goods Bogies
This use case enforces safety rules for cargo assignments using the Stream API. Goods bogies are evaluated using the `allMatch()` operation to ensure that specific cargo types are allowed only in compatible bogie shapes. If all rules pass, the train is marked safe for operation.

## UC13: Performance Comparison (Loops vs Streams)
This use case measures execution time of loop-based and stream-based operations using `System.nanoTime()`. By benchmarking both approaches, the program demonstrates how developers can evaluate performance differences instead of relying on assumptions.

## UC14: Handle Invalid Bogie Capacity (Custom Exception)
This use case introduces a custom checked exception to prevent creation of bogies with invalid capacity values. If the capacity is less than or equal to zero, an `InvalidCapacityException` is thrown during object construction, enforcing domain rules at the earliest stage.

## UC15: Safe Cargo Assignment Using try-catch-finally
This use case demonstrates structured exception handling during runtime cargo assignments. If unsafe cargo combinations are attempted, a custom runtime exception is thrown and caught using `try-catch`. The `finally` block executes cleanup or logging operations, ensuring the application continues safely.

## UC16: Sort Passenger Bogies by Capacity (Bubble Sort)
This use case introduces the Bubble Sort algorithm to manually sort passenger capacities without using built-in libraries. The algorithm repeatedly compares adjacent elements and swaps them when they are out of order. This teaches the internal logic behind sorting algorithms.

## UC17: Sort Bogie Names Using Arrays.sort()
This use case demonstrates how Java’s optimized `Arrays.sort()` method can sort bogie names alphabetically. Instead of implementing manual algorithms, the built-in method provides efficient sorting with minimal code.

## UC18: Linear Search for Bogie ID
This use case implements Linear Search to locate a specific bogie ID within an unsorted array. The system checks each element sequentially until the desired ID is found or the list ends. This demonstrates the simplest form of search logic.
