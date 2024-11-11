# Multiple Choice Questions

## Question 1
The size of an array that signifies the number of elements it can store is given using ........... brackets.

- `{}` 
- `[]` ✓
- `()`
- All of these

---

## Question 2
Given array `int x[] = {11, 22, 33, 44};` the value of `x[1]` is ........... .

- 11
- 22 ✓
- 33
- Invalid value

---

## Question 3
Given array `int x[] = {11, 22, 33, 44};` the value of `x[1+2]` is ........... .

- 11
- 22
- 33
- 44 ✓

---

## Question 4
If `int arr[] = {3, 5, 7, 9};` what is the value of `arr.length`?

- 3
- 5
- 4 ✓
- Cannot be determined

---

## Question 5
Given array `int z[] = {15, 16, 17};` It will occupy ........... bytes in memory.

- 3
- 12 ✓
- 24
- 64

---

## Question 6
A linear search ...........

- can be used with sorted arrays only
- can be used with unsorted arrays only
- can be used with both sorted and unsorted arrays ✓
- cannot be used with arrays

---

## Question 7
A binary search

- can be used with sorted arrays only ✓
- can be used with unsorted arrays only
- can be used with both sorted and unsorted arrays
- cannot be used with arrays

---

## Question 8
Which of the following statements is true?

- Binary search is less efficient than the sequential search.
- Binary search is less efficient than the linear search.
- Binary search is more efficient than the sequential search. ✓
- Binary search is as efficient as the sequential search.

---

## Question 9
In ........... search, the algorithm uses the middle value of the array for the search operation.

- Binary ✓
- Linear
- Bubble
- Selection

---

## Question 10
Which element is `num[9]` of the array `num`?

- 8th
- 9th
- 10th ✓
- 11th

---

# Assignment Questions

## Question 1
### Write a program to initialize the given data in an array and find the minimum and maximum values along with the sum of the given elements.

**Numbers:** 2, 5, 4, 1, 3

### Answer:


public class MinMaxSum
{
    public static void main(String args[]) {
        int arr[] = {2, 5, 4, 1, 3};
        
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
                
            if (arr[i] < min)
                min = arr[i];
                
            sum += arr[i];
        }
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of the elements: " + sum);
    }
}

## Q.2  ![image](https://github.com/user-attachments/assets/d956a6c3-a472-4014-bc98-57c029af8f44)

## Q.3 ![image](https://github.com/user-attachments/assets/8fe1216c-512b-4e8d-b972-be7a047a8d33)

## Q.4 ![image](https://github.com/user-attachments/assets/c9d44b35-d7ea-4892-8940-1fee6d66a687)

## Q.5 Explain the technique of Selection Sort with an example.
# Selection Sort Algorithm

**Selection Sort** divides the array into two parts — a sorted sub-array and an unsorted sub-array. In each pass, it selects the minimum element from the unsorted sub-array and swaps it with the leftmost unsorted element, effectively moving the boundary of the sorted sub-array one element to the right.

### Steps:
1. Start with the entire array unsorted.
2. Find the smallest element in the unsorted part.
3. Swap it with the leftmost unsorted element.
4. Repeat the process for the remaining unsorted elements.

### Example:

Given the unsorted array:
9 5 2 3

#### Pass 1:
- The smallest element is `2`, so swap it with `9`.
2 3 9 5
  
#### Pass 3:
- The smallest element in the remaining unsorted part (`9 5`) is `5`, so swap it with `9`.
2 3 5 9


The array is now sorted:
2 3 5 9

