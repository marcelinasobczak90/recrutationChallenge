# SortedPairs

## Overview
`SortedPairs` is a Java class that finds and prints pairs of integers from a given array whose sum is equal to a predefined value (sum). It sorts the array, then iterates through it to find pairs that sum up to the specified value.

## Features
- Finds and prints pairs of integers from the array whose sum is equal to a predefined value.
- Handles user input to create an array of integers from space-separated input.

## Usage in Terminal

1. **Compile Java Class**:
    - Compile the `SortedPairs.java` file using `javac` command:
   ```bash
   javac SortedPairs.java
2. **Run Java Program**:
    - Execute the compiled Java class using the java command:
   ```bash
   java SortedPairs
3. **Provide Input**:
    - When prompted, enter space-separated integers and press Enter:
   ```bash
   Put numbers separated by space
   1 5 6 7 3 9 8 4
4. **Output**:
    - The program will display pairs of integers whose sum is equal to the predefined value (sum). For example:
   ```bash
   4  9
   5  8
   6  7

## Code Explanation
   - `private static Map<Integer, Integer> getMap(int[] arr)`:
      - Converts the input array into a HashMap where the key is the integer and the value is the count of occurrences.
   - `public static void printAllPairs(int[] arr)`:
      - Sorts the input array.
      - Uses the HashMap to find and print all pairs that add up to the target sum.
   - `public static void main(String[] args)`:
      - Reads user input.
      - Converts the input string to an integer array.
      - Calls printAllPairs to print the pairs.
## Note
- Ensure that the input provided by the user is valid. Invalid inputs may result in exceptions.
- Maximum size of the list should be 10 000 000.