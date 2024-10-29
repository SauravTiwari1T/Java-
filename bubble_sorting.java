import java.util.*;

 class HelloWorld {
    public static void main(String[] args) {
        int[] a = {20, 30, 99, 50, 60, 70, 80};


        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }


        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
