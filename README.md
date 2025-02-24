# Sorting Algorithms in Java

This repository contains Java implementations of various sorting algorithms, including:

- Bubble Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Selection Sort

Each algorithm is implemented in a separate Java file with clear comments explaining the logic.

## Sorting Algorithms Overview

### 1. Bubble Sort
Bubble Sort is a simple sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order. This process continues until the array is sorted.
- **Time Complexity:** O(n²) (worst and average case), O(n) (best case, when already sorted)
- **Space Complexity:** O(1)

### 2. Insertion Sort
Insertion Sort builds the sorted array one element at a time by inserting elements into their correct position.
- **Time Complexity:** O(n²) (worst and average case), O(n) (best case, when already sorted)
- **Space Complexity:** O(1)

### 3. Merge Sort
Merge Sort is a divide-and-conquer algorithm that recursively splits the array into halves, sorts them, and merges them back together.
- **Time Complexity:** O(n log n) (worst, average, and best case)
- **Space Complexity:** O(n)

### 4. Quick Sort
Quick Sort selects a pivot and partitions the array around the pivot such that elements smaller than the pivot are on the left and greater are on the right, then recursively sorts both halves.
- **Time Complexity:** O(n²) (worst case), O(n log n) (average and best case)
- **Space Complexity:** O(log n) (recursive calls)

### 5. Selection Sort
Selection Sort repeatedly selects the smallest element from the unsorted portion and swaps it with the first unsorted element.
- **Time Complexity:** O(n²) (worst, average, and best case)
- **Space Complexity:** O(1)


## Contribution
Feel free to contribute by improving code efficiency or adding new sorting algorithms. Fork the repository and submit a pull request.

## License
This project is open-source and available under the MIT License.

