/* Java Basics: Control Flow Statements
Objective:
By the end of this course, students will be able to understand and use conditional statements (if, if-else, else-if) and loops (while, do-while, for) in Java.
*/

// Introduction to Conditional Statements

// What is a Conditional Statement?
// Conditional statements allow us to make decisions in our code. Based on certain conditions, different actions can be executed.

/* 1. if Statement
The if statement checks whether a condition is true or false. If the condition is true, the code inside the if block runs.
*/
import java.util.*;
public class ConditionalExample {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }
    }
}

/*
q1.Voting Eligibility:

*/
public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}


/* 2. if-else Statement
The if-else statement provides two paths: one if the condition is true, and another if it is false. */

public class ConditionalExample {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}

// q2. Positive/Negative Check:
public class PositiveNegative {
    public static void main(String[] args) {
        int number = -5;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}


/* 
3. else-if Statement
The else-if statement allows us to check multiple conditions in sequence.
*/

public class ConditionalExample {
    public static void main(String[] args) {
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}

// q.3 Day of the Week:
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number.");
        }
    }
}



/* 
Lesson 2: Introduction to Loops
Loops are used when we want to repeat a block of code multiple times.

1. while Loop
The while loop continues as long as the condition is true.
*/

public class LoopExample {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}

// q1. While Loop (Numbers from 1 to 10):
public class PrintNumbers {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }
}

/* 
2. do-while Loop
The do-while loop is similar to the while loop, but it guarantees that the code will run at least once, even if the condition is false initially.
*/
public class LoopExample {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);
    }
}
// q.2 Do-while Loop (Greater Than 10):
import java.util.Scanner;

public class GreaterThanTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number <= 10);
        System.out.println("You entered a number greater than 10.");
    }
}

/*
3. for Loop
The for loop is used when you know exactly how many times you want to repeat something.
*/
public class LoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i is: " + i);
        }
    }
}
// q 3. For Loop (Even Numbers 2 to 20):
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
