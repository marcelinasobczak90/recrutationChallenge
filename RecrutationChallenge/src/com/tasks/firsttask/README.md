# SortedList

## Overview
`SortedList` is a Java class that represents a sorted list of integers. It uses a `TreeSet` internally to maintain the order of numbers and provides various functionalities such as printing the elements, counting the total number of elements, counting distinct elements, and finding the minimum and maximum elements in the list.

## Features
- Sorts the input list of integers and stores them in a `TreeSet`.
- Provides a string representation of the list, including count, distinct count, minimum, and maximum elements.
- Handles user input to create a sorted list from space-separated integers.

## Usage in Terminal

1. **Compile Java Class**:
    - Compile the `SortedList.java` file using `javac` command:
   ```bash
   javac SortedList.java
2. **Run Java Program**:
    - Execute the compiled Java class using the java command:
   ```bash
   java SortedList
3. **Provide Input:**:
    - When prompted, enter space-separated integers and press Enter:
   ```bash
   Put numbers separated by space
   5 3 8 2 8 1
4. **Output**:
    - The program will display the sorted list along with count, distinct count, minimum, and maximum elements:
   ```bash
   1 2 3 5 8 
   count: 6
   distinct: 5
   min: 1
   max: 8
   
## Note
   - Ensure that the input provided by the user is valid. Invalid inputs may result in exceptions.
   - The TreeSet used internally ensures that the elements are sorted and unique.
   - Maximum size of the list should be 10 000 000.