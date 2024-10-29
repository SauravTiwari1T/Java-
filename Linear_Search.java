// Write a Java program that allows the user to enter the names of 5 countries and their corresponding populations. Then, prompt the user to search for a country by name and display its population and index position if found.

import java.util.Scanner;

class Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] countries = new String[5];
        int[] populations = new int[5];

        // Input countries and their populations
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of country " + (i + 1) + ":");
            countries[i] = scanner.next();
            System.out.println("Enter the population of " + countries[i] + ":");
            populations[i] = scanner.nextInt();
        }

        // Search for a country
        System.out.print("Enter the name of the country you want to search for: ");
        String searchCountry = scanner.next();
        int position = -1;
        boolean isFound = false;

        // Search logic
        for (int i = 0; i < 5; i++) {
            if (searchCountry.equalsIgnoreCase(countries[i])) {
                position = i;
                isFound = true;
                System.out.println("Search Successful");
                System.out.println("Country: " + countries[i] + ", Population: " + populations[i] + ", Position: " + position);
                break;
            }
        }
        if (!isFound)
 { System.out.println("Search Unsuccessful, no such country in the list."); 
} 
}
 }
 
  
