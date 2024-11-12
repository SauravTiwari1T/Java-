//1. Java Program to Sum Row-Wise in a 2D Array
import java.util.*;
class Main 
 {

public static void main(String[] args) 
{
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) 
        {
         
            int rowSum = 0;
                System.out.println(rowSum);
            for (int j = 0; j < cols; j++) 
            {
                rowSum = rowSum + array[i][j]; 
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
    }
}

//2. col wise 
import java.util.*;
class Main 
 {

public static void main(String[] args) 
{
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                array[i][j] = scanner.nextInt();
           
            }
              
        }
         for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
               
             System.out.print( array[i][j]);
            }
               System.out.println();
        }
        System.out.println("Sum of each row:");
        for (int i = 0; i < cols; i++) 
        {
         
            int colssum = 0;
                System.out.println(colssum);
            for (int j = 0; j < rows; j++) 
            {
                rowSum = rowSum + array[j][i]; 
            }
            System.out.println("Sum of row " + (i + 1) + ": " + colssum);
        }
    }
}

//3. Diagonal addtion 
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows/columns: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                array[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += array[i][i];  
        }

        System.out.println("Sum of the primary diagonal: " + diagonalSum);


    }
}

//4.  Diagonal addtion right
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows/columns: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                array[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += array[i][n-1-i];  
        }

        System.out.println("Sum of the primary diagonal: " + diagonalSum);


    }
}

//5. check if diagonal are equal 
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows/columns: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                array[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum1 = 0;
            int diagonalSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum1 = diagonalSum1 + array[i][n-1-i];  
        }
        for(int i = 0 ; i<n ; i++)
        {
            diagonalSum2 =  diagonalSum2 + array[i][i];  
        }
         
        
        System.out.println("Sum of the primary diagonal: " + diagonalSum1 + diagonalSum2 );
        
        if(diagonalSum1 == diagonalSum2)
        {
               System.out.println("Yes it is");
        }


    }
}
