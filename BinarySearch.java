import java.util.Scanner;

public class  BinarySearch
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int arr[] = {5, 7, 9, 11, 15, 20, 30, 45, 89, 97};
        
        System.out.print("Enter number to search: ");
        int n = in.nextInt();
        
        int l = 0, h = arr.length - 1, index = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < n)
                l = m + 1;
            else if (arr[m] > n)
                h = m - 1;
            else {
                index = m;
                break;
            }
                
        }
        if (index == -1) {
            System.out.println("Search element not found");
        }
        else {
            System.out.println(n + " found at position " + index);
        }
    }
}
