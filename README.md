

---

# Bubble Sort in Descending Order with Swap Count

## Description

This Java program sorts an integer array in **descending order** using the Bubble Sort algorithm. It also counts and displays the total number of swaps performed during sorting. The algorithm optimizes performance by stopping early if the array becomes sorted before completing all passes.

## Features

* Sorts an array in descending order using Bubble Sort.
* Tracks and outputs the total number of swaps.
* Uses a flag to detect if the array is already sorted to avoid unnecessary passes.
* Prints the sorted array after completion.

## Code Structure

* `Question1` class: Contains the main method implementing the descending bubble sort with swap counting.

## How to Run

1. Compile the program:

   ```bash
   javac Question1.java
   ```

2. Run the program:

   ```bash
   java Question1
   ```

## Sample Output

```
Total Number of swaps are: 5
Sorted Array (Descending Order): 9 6 5 5 2 1 
```

## Explanation

* The outer loop controls passes through the array.
* The inner loop compares adjacent elements and swaps them if the next element is greater (to get descending order).
* A `swapped` flag tracks if any swaps occurred in a pass. If no swaps happen, the array is already sorted, and the loop breaks early.
* The total swap count gives insight into the sorting process efficiency.
* Finally, the sorted array is printed.

## Requirements

* Java JDK 8 or above
* Basic knowledge of arrays and sorting algorithms in Java

