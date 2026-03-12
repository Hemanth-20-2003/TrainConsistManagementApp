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
