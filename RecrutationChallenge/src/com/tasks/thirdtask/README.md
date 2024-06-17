# Subgraphs Counter

## Overview

SupgraphsCounter is a Java program designed to count the number of subgraphs in an undirected graph. This is achieved using the union-find data structure (also known as disjoint-set), which helps efficiently manage and merge sets of elements.

## How It Works

1. **Input Reading**:
   The program reads the number of edges and their corresponding vertex pairs from standard input.
2. **Union-Find Initialization**:
   Initializes the parent and rank arrays used for the union-find operations.
3. **Union Operations**:
   Processes each edge to join vertices, merging sets as necessary.
4. **Counting Subgraphs**:
   Finds the root of each vertex and counts the number of unique roots, which represents the number of subgraphs.

## Usage in Terminal

To use this program, follow these steps:

1. **Compile Java Class**:
   - Compile the `SubgraphsCounter.java` file using `javac` command:
   ```bash
   javac SubgraphsCounter.java
   ```
2. **Run Java Program**:
   - Execute the compiled Java class using the java command:
   ```bash
   java SubgraphsCounter
   ```
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
   ```
   **Output**:
   ```bash
   2
   [1, 2, 3]
   [4, 5]
   ```

## Code Explanation

### Class Variables

- `roots`: A set to store unique roots of vertices.
- `parents`: An array to store the parent of each vertex.
- `ranks`: An array to store the rank (or depth) of each tree in the union-find structure.

### Methods

- `findRoot(int vertex)`: Recursively finds the root of a vertex, applying path compression.
- `joinVerticles(int v1, int v2)`: Joins two vertices if they belong to different sets, using union by rank.
- `getSubgraphsNumber(List<int[]> edges, Set<Integer> vertices)`: Initializes the union-find structure, processes the edges, and counts the number of unique roots to determine the number of subgraphs.

## Dependencies

This program requires Java version 8 or higher.
