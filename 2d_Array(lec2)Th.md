Multiple Choice Questions
Question 1
The size of an array that signifies the number of elements it can store is given using ........... brackets.

{}
[] ✓
()
All of these
Question 2
Given array int x[] = {11, 22, 33, 44}; the value of x[1] is ........... .

11
22 ✓
33
Invalid value
Question 3
Given array int x[] = {11, 22, 33, 44}; the value of x[1+2] is ........... .

11
22
33
44 ✓
Question 4
If int arr[] = {3, 5, 7, 9}; what is the value of arr.length?

3
5
4 ✓
Cannot be determined
Question 5
Given array int z[] = {15, 16, 17}; It will occupy ........... bytes in memory.

3
12 ✓
24
64
Question 6
A linear search ...........

can be used with sorted arrays only
can be used with unsorted arrays only
can be used with both sorted and unsorted arrays ✓
cannot be used with arrays
Question 7
A binary search

can be used with sorted arrays only ✓
can be used with unsorted arrays only
can be used with both sorted and unsorted arrays
cannot be used with arrays
Question 8
Which of the following statements is true?

Binary search is less efficient than the sequential search.
Binary search is less efficient than the linear search.
Binary search is more efficient than the sequential search. ✓
Binary search is as efficient as the sequential search.
Question 9
In ........... search, the algorithm uses the middle value of the array for the search operation.

Binary ✓
Linear
Bubble
Selection
Question 10
Which element is num[9] of the array num?

8th
9th
10th ✓
11th
Assignment Questions
Question 1
Write a program to initialise the given data in an array and find the minimum and maximum values along with the sum of the given elements.

Numbers: 2, 5, 4, 1, 3

Output:
Minimum value: 1
Maximum value: 5
Sum of the elements: 15

Answer

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
Output
BlueJ output of KboatMinMaxSum.java
Question 2
Differentiate between the following.

i. Array Declaration and Initialisation

Answer

Array declaration tells the compiler about the size and data type of the array so that the compiler can reserve the required memory for the array. This reserved memory is still empty. Array Initialisation assigns values to the array elements i.e. it stores values in the memory reserved for the array elements.

ii. int a[10] and char a[10]

Answer

int a[10] is an array of int data type that can hold 10 integer values whereas char a[10] is an array of char data type that can hold 10 characters.

iii. Sorting and Searching

Answer

Sorting	Searching
Sorting means to arrange the elements of the array in ascending or descending order.	Searching means to search for a term or value in an array.
Bubble sort and Selection sort are examples of sorting techniques.	Linear search and Binary search are examples of search techniques.
iv. Linear search and Binary search

Answer

Linear Search	Binary Search
Linear search works on sorted and unsorted arrays	Binary search works on only sorted arrays (ascending or descending)
Each element of the array is checked against the target value until the element is found or end of the array is reached	Array is successively divided into 2 halves and the target element is searched either in the first half or in the second half
Linear Search is slower	Binary Search is faster
v. Selection sort and Bubble sort

Answer

Selection sort	Bubble sort
Selection Sort selects the smallest element from unsorted sub-array and swaps it with the leftmost unsorted element.	Bubble Sort compares adjacent elements and swaps them if they are in wrong order.
Performs lesser number of swaps to sort the same array relative to Bubble Sort	Performs more number of swaps to sort the array
Selection Sort is faster	Bubble Sort is slower
Question 3
How does the linear search find an element in the array? Explain your answer with a suitable example.

Answer

In linear search, we start at the first element of the array and sequentially check each element of the list for the search value until a match is found or all the elements have been searched. As soon as the search value is found, the algorithm quits and returns the position (index) of the target value in the array.

For example, consider the following array:

int arr[] = {1, 8, 4, 7, 5};
We want to check if 7 is present in the array or not. Linear search will first check if 1 is equal to 7, then it will move on to the next element which is 8. It will keep doing this in a linear progression and when it reaches the element at index 3, it finds a match so it will give us this index 3 which means that 7 is present at index 3 of array arr.

Question 4
Explain the technique of Bubble Sort with an example.

Answer

Bubble Sort is a sorting algorithm that works by repeatedly iterating through the array, comparing each pair of adjoining elements and swapping them if they are in wrong order.

For example, consider the following unsorted array:

9	5	2	3
Pass 1

First 9 is compared with 5 and as 9 is greater than 5 the elements are swapped:

5	9	2	3
Next, 9 is compared with 2 and as 9 is greater than 2 the elements are swapped:

5	2	9	3
Next, 9 is compared with 3 and as 9 is greater than 3 the elements are swapped:

5	2	3	9
At the end of first pass, the highest element of the array is at the last position.

Pass 2

5 is compared with 2 and as 5 is greater than 2 the elements are swapped:

2	5	3	9
Next, 5 is compared with 3 and as 5 is greater than 3 the elements are swapped:

2	3	5	9
At the end of first pass, the second highest element of the array is in its correct position.

Pass 3

2 is compared with 3 and as 2 is less then 3 no swapping takes place.

2	3	5	9
With this, the third and final pass ends and the elements of the array are in sorted order.

Question 5
Explain the technique of Selection Sort with an example.

Answer

Selection Sort divides the array into two parts — sorted sub-array and unsorted sub-array. In each pass, it finds the minimum element of the unsorted sub-array and swaps it with the leftmost unsorted element moving the sorted sub-array one element to the right.

For example, consider the following unsorted array:

9	5	2	3
Pass 1

At the start, the smallest element of the array is selected (which is 2) and swapped with the element at 0th index (which is 9):

2	5	9	3
At the end of the first pass, the smallest element is in its correct position. Length of sorted sub-array is 1 and unsorted sub-array is 3.

Pass 2

The smallest element of the unsorted sub-array is selected (which is 3) and swapped with the element at 1st index (which is 5):

2	3	9	5
At the end of the second pass, length of sorted sub-array is 2 and unsorted sub-array is 2.

Pass 3

The smallest element of the unsorted sub-array is selected (which is 5) and swapped with the element at 2nd index (which is 9):

2	3	5	9
With this, the third and final pass ends and the elements of the array are in sorted order.

Question 6
Why does Binary Search need a sorted array to perform the search operation?

Answer

In Binary Search, the array is repeatedly divided into two halves and the element is searched in that half whose last element is greater than or equal to the element being searched. For this reason, Binary Search needs a sorted array to perform the search operation.

Question 7
How does the binary search find the presence of an element quicker than the linear search?

Answer

As Binary Search repeatedly divides the array into two halves and performs the search in only one of those two halves, it needs to make fewer comparisons relative to Linear Search hence it is faster than Linear Search.
