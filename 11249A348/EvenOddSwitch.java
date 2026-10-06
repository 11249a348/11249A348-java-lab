Aim:
   To write a Java program to check whether a given number is even or odd using a switch statement.

Algorithm:
1.Start the program.
2.Create a Scanner object to read the number.
3.Read the number n.
4.Find the remainder using n % 2.
5.Use a switch statement:
   If the remainder is 0, the number is even.
   If the remainder is 1, the number is odd.
6.Display the result.
7.Stop the program

program:
import java.util.*;
class EvenOddSwitch
{
public static void main(String args[])
{
int n,i;
Scanner s = new Scanner(System.in);
n = s.nextInt();
switch(n%2)
{
case 0 :
System.out.println("This number is even");
break;
case 1 :
System.out.println("This number is odd");
break;
}
}
}

Output:
Example 1:
10
This number is even

Example 2:
7
This number is odd

Result:
       Thus, the Java program was successfully executed to check whether the given number is even or odd using a switch statement. 
