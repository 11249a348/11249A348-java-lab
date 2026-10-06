Aim:
   To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a switch statement.

Algorithm:
1.Start the program.
2.Create a Scanner object to read input from the user.
3.Read two numbers x and y.
4.Display the menu of arithmetic operations.
5.Read the user's choice.
6.Use a switch statement to perform the selected operation:
  Choice 1 → Addition
  Choice 2 → Subtraction
  Choice 3 → Multiplication
  Choice 4 → Division
  Choice 5 → Modulus
  Choice 6 → Exit
7.Display the result.
8.Repeat the process until the user selects Exit.
9.Stop the program.

program:
import java.util.Scanner;
public class ArithmeticOperators
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
while(true)
{
System.out.println("");
System.out.println("Enter the two numbers to perform operations ");
System.out.print("Enter the first number : ");
int x = s.nextInt();
System.out.print("Enter the second number : ");
int y = s.nextInt();
System.out.println("Choose the operation you want to perform ");
System.out.println("Choose 1 for ADDITION");
System.out.println("Choose 2 for SUBTRACTION");
System.out.println("Choose 3 for MULTIPLICATION");
System.out.println("Choose 4 for DIVISION");
System.out.println("Choose 5 for MODULUS");
System.out.println("Choose 6 for EXIT");
int n = s.nextInt();
switch(n)
{
case 1:
int add;
add = x + y;
System.out.println("Result : "+add);
break;
case 2:
int sub;
sub = x - y;
System.out.println("Result : "+sub);
break;
case 3:
int mul;
mul = x * y;
System.out.println("Result : "+mul);
break;
case 4:
float div;
div = (float) x / y;
System.out.print("Result : "+div);
break;
case 5:
int mod;
mod = x % y;
System.out.println("Result : "+mod);
break;
case 6:
System.exit(0);
}
}
}
}

Output:
Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 10
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
1
Result : 30

Result:
   Thus, the Java program was successfully executed to perform addition, subtraction, multiplication, division, and modulus operations using a switch statement.
