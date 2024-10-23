Variable Declaration and Initialization
In Java, you need to specify the data type when declaring a variable.

String name = "Saurav";
String Name = "Ram";
System.out.println(name);
System.out.println(Name);

Java uses braces {} to define blocks of code instead of indentation.
    int age = 32;
if (age > 30) {
    System.out.println(age);
} // Below print is outside of the if block
System.out.println(age);



Print Statement
You use System.out.println in Java to print output.
System.out.println("Hello world");



Variable Assignment
In Java, you also need to define data types.
int number = 5;
int age = 45; 
String name = "Saurav";
System.out.println(number + " " + age + " " + name);


Type Inference
var var1 = 10; // Using var for type inference
System.out.println(var1);

var1 = "Saurav"; // This will cause an error since var1 cannot change type
System.out.println(var1);


Example Java Code
public class Main {
    public static void main(String[] args) {
        // Variable Declaration
        String name = "Saurav";
        String Name = "Ram";
        System.out.println(name);
        System.out.println(Name);

        // Indentation
        int age = 32;
        if (age > 30) {
            System.out.println(age);
        }
        System.out.println(age);

        // Print Statement
        System.out.println("Hello world");

        // Line Continuation
        int total = 102 + 2 + 3 + 4 + 5 + 89 +
                    78 + 56;
        System.out.println(total);

        // Multiple Statements on a Single Line
        int x = 5; 
        int y = 4; 
        int z = x + y; 
        System.out.println(z);
        
        // Variable Assignment
        int number = 5;
        age = 45; 
        name = "Saurav";
        System.out.println(number + " " + age + " " + name);

        // Type Inference (Java 10 and above)
        var var1 = 10;
        System.out.println(var1);
        
        // Uncommenting the next line will cause an error since var1 can't change types
        // var1 = "Saurav";
        // System.out.println(var1);
    }
}

