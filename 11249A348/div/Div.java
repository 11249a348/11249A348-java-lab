AIM:
   To write a Java program using a user-defined package named div to perform the division of two numbers.

ALGORITHM:
1.Start the program.
2.Create a package named div.
3.Define a public class named Div.
4.Declare an integer variable res to store the result.
5.Define a method named divop(int a, int b).
6.Perform division using res = a / b.
7.Display the result using the System.out.println() statement.
8.Create an object of the Div class in the main program and call the divop() method with values 20 and 10.
9.Stop the program.

PROGRAM:
package div;
public class Div
{
int res;
public void divop(int a,int b)
{
res = a /b;
System.out.println("Div :"+res);
}
}

OUTPUT:
Div :2

RESULT:
     Thus, the Java program using a user-defined package to perform division of two numbers was successfully executed, and the expected output was obtained.
