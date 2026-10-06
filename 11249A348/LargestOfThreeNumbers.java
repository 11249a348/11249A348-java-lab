Aim:
  To write a Java program to find the largest among three numbers using if-else statement

Algorithm:
1.Start the program.
2.Declare three integer variables x, y, and z.
3.Create a Scanner object to read three integers from the user.
4.Compare x with y and z.
5.If x is greater than both, display that the first number is largest.
6.Otherwise, compare y with x and z.
7.If y is greater than both, display that the second number is largest.
8.Otherwise, compare z with x and y.
9.If z is greater than both, display that the third number is largest.
10.If none of the conditions are satisfied, display that the numbers are not distinct.
11.Stop the program.

program:
import java.util.Scanner;
class LargestOfThreeNumbers
{
public static void main(String args[])
{
int x, y, z;
System.out.println("Enter three integers");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextInt();
if (x > y && x > z)
System.out.println("First number islargest.");
else if (y > x && y > z)
System.out.println("Second number islargest.");
else if (z > x && z > y)
System.out.println("Third number islargest.");
else
System.out.println("The numbers are not distinct.");
}
}

output:
Enter three integers
10
25
15
Second number islargest.

Result:
   Thus, the Java program to find the largest of three numbers was successfully executed.
