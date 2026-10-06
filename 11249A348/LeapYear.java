Aim:
   To write a Java program to check whether a given year is a leap year or not.

Algorithm:
1.Start the program.
2.Create a Scanner object to read the year.
3.Read the year from the user.
4.If the year is divisible by 400, it is a leap year.
5.Else if the year is divisible by 100, it is not a leap year.
6.Else if the year is divisible by 4, it is a leap year.
7.Otherwise, it is not a leap year.
8.Display whether the given year is a leap year or not.
9.Stop the program.

program:
import java.util.Scanner;
public class LeapYear
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter any year:");
int year = s.nextInt();
boolean flag = false;
if(year % 400 == 0)
{
flag = true;
}
else if (year % 100 == 0)
{
flag = false;
}
else if(year % 4 == 0)
{
flag = true;
}
else
{
flag = false;
}
if(flag)
{
System.out.println("Year "+year+" is a Leap Year");
}
else
{
System.out.println("Year "+year+" is not a Leap Year");
}
}
}

output:
Enter any year:2024
Year 2024 is a Leap Year

Result:
    Thus, the Java program to check whether the given year is a leap year or not was successfully executed.
