/*
 Q3 ) 3.  Create a arraylist of students name and remove name of students who start with ‘S’ using lambda expression.
 */
package LabCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Studentnameremove 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList of student names
        List<String> studentNames = new ArrayList<>();

        // Get user input for student names until the user decides to stop
        while (true) {
            System.out.print("Enter a student name (or type 'stop' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("stop"))
            {
                break;
            }

            // Add the name to the list
            studentNames.add(name);
        }

        // Print the original list
        System.out.println("\nOriginal List of Student Names:");
        System.out.println(studentNames);

        // Remove names starting with 'S' using lambda expression
        studentNames.removeIf(name -> name.startsWith("S"));

        // Print the modified list
        System.out.println("\nList after Removing Names Starting with 'S':");
        System.out.println(studentNames);

        // Close the scanner
        scanner.close();
    }

}
