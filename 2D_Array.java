import java.util.Scanner;

class TwoDArrayExample
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
     
        int rows = 3;
        int cols = 5;
        
 
        int[][] array = new int[rows][cols];
        
     
        System.out.println("Enter elements for a 3x5 array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

    
        System.out.println("The elements of the 3x5 array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    } 
}
