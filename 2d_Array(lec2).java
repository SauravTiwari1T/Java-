/* Q1. To print 2d array when array is given  
  array =    {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };    
*/
public class Print2DArray {

    public static void main(String[] args) {
        
        int[][] array = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

    
        System.out.println("2D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " "); 
            }
            System.out.println();  
        }
    }
}

//----------------------------------------------------------------
// Q2. Take row and col from user , create an array and print 
import java.util.Scanner;

public class UserInput2DArray {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

      
        int[][] array = new int[rows][cols];

    
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }

  
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");  
            }
            System.out.println();  
        }
    }
}




//----------------------------------------------------------------------------
// Q3. sum the elements of each row in a 2D array and print the sum of each row individually

public class AddRowsOf2DArray {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;  row
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j]; 
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
    }
}
//-----------------------------------------------------------------------------------------
// Q4. Java Program to Take Input and Print the Sum of a 2D Array

import java.util.Scanner;

public class UserInput2DArraySum {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();


        int[][] array = new int[rows][cols];

    
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                array[i][j] = scanner.nextInt();  
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j]; 
            }
        }


        System.out.println("The sum of all elements in the 2D array is: " + sum);

    }
}
//-----------------------------------------------------------------------------------------
/* Q.5 Find the sum of each rows of given array  array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
*/
public class Predefined2DArrayRowWiseSum {

    public static void main(String[] args) {
    
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

    
        System.out.println("Row-wise sum of the 2D array:");
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0; 
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];   
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);  
        }
    }
}
//------------------------------------------------------------------------------------------------
// Q.6 Take input from user and Calculate and Print Row-wise Sum of a 2D Array
import java.util.Scanner;

public class UserInput2DArrayRowWiseSum {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

  
        int[][] array = new int[rows][cols];

   
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                array[i][j] = scanner.nextInt(); 
            }
        }

     
        System.out.println("Row-wise sum of the 2D array:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0; 
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];  
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum); 
        }

    }
}



//--------------------------------------------------------------------------------------------------------------------------
