/*
 Q2) A class teacher has decided to split her entire class into four groups, namely Sapphire, Perl, Ruby, and Emerald for sports competitions. 
 For dividing the students into these four groups, she has followed the pattern given below:

                Sapphire - 1, 5, 9, 13, 17, 21, ...

Perl - 2, 6, 10, 14, 18, 22, ...

Ruby - 3, 7, 11, 15, 19, 23, ...

Emerald - 4, 8, 12, 16, 20, 24, ...

All the students are represented by their roll numbers. 
Based on the above pattern, given the roll number as input, print the group the student belongs to. 
Note that the roll number can be any positive integer and not necessarily less than 25.

 */
package LabCode;
import java.util.Scanner;
public class StudentGroupAssignment 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get the roll number from the user
        System.out.print("Enter the roll number of the student between 1-25: ");
        int rollNumber = scanner.nextInt();

        // Calculate the group based on the given pattern
        int group = (rollNumber - 1) % 4 + 1;//(5-1)%4+1=4%5=1

        // Print the group
        System.out.print("Student with roll number " + rollNumber + " belongs to ");
        switch (group) 
        {
            case 1:
                System.out.println("Sapphire Group.");
                break;
            case 2:
                System.out.println("Perl Group.");
                break;
            case 3:
                System.out.println("Ruby Group.");
                break;
            case 4:
                System.out.println("Emerald Group.");
                break;
            default:
                System.out.println("an unknown group.");
        }

        // Close the scanner
        scanner.close();
    }
}

