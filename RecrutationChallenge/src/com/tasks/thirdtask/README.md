# Subgraphs Counter

## Overview
This Java program is designed to count the number of subgraphs in a graph represented by a list of edges. It takes input in the form of pairs of integers representing edges, and outputs the count of distinct subgraphs in the graph.

## Usage in Terminal
To use this program, follow these steps:
1. **Compile Java Class**:
    - Compile the `SubgraphsCounter.java` file using `javac` command:
   ```bash
   javac SubgraphsCounter.java
2. **Run Java Program**:
    - Execute the compiled Java class using the java command:
   ```bash
   java SubgraphsCounter
3. **Input Format: The program expects the following input format**:
    - The first line should contain an integer n, denoting the number of lines of input to follow.
    - Following n lines should contain pairs of integers separated by a space, representing the edges in the graph.
4. **Output Format: The program will output the following:**:
    - The total number of distinct subgraphs in the input graph.
    - Each distinct subgraph represented as a set of integers.
5. **Example**:
   ```bash
    Put number of lines n and n-lines containing pairs:
    3
    1 2
    2 3
    4 5
   ````
   **Output**:
    ```bash
    2
    [1, 2, 3]
    [4, 5]
   ```
## Algorithm
The program uses a recursive algorithm to identify connected subgraphs in the input graph. It then counts the number of distinct subgraphs and prints them out.

## Dependencies
This program requires Java version 8 or higher.