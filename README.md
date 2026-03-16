# TrainConsistManagementApp
## UC1: Initialize Train and Display Consist Summary
This use case initializes the Train Consist Management application and displays the initial state of the train formation. The program starts from the `main()` method, prints a welcome message, and creates an empty `ArrayList` to store train bogies. Since no bogies are added initially, the system displays the starting bogie count using the `size()` method. This use case introduces the concept of application startup flow and demonstrates why dynamic collections like `ArrayList` are useful instead of fixed-size arrays.

## UC2: Add Passenger Bogies to Train (ArrayList Operations)
This use case demonstrates how passenger bogies can be dynamically added and removed using `ArrayList` operations. Bogies such as Sleeper, AC Chair, and First Class are inserted into the list using the `add()` method. The program then removes a bogie using the `remove()` method and checks whether a specific bogie exists using the `contains()` method. This shows how `ArrayList` supports dynamic CRUD operations while preserving insertion order, making it suitable for managing train components that may frequently change.
