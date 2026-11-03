AIM:
    To write a Java program using a user-defined package named sub to perform the subtraction of two numbers.

ALGORITHM:
1.Start the program.
2.Create a package named sub.
3.Define a public class named Sub.
4.Declare an integer variable res to store the result.
5.Define a method named subop(int a, int b).
6.Perform subtraction using res = a - b.
7.Display the result using the System.out.println() statement.
8.Create an object of the Sub class in the main program and call the subop() method with values 20 and 10.
9.Stop the program.

PROGRAM:
package sub;
public class Sub
{
int res;
public void subop(int a,int b)
{
res = a - b;
System.out.println("Sub:"+  res);
}
}

OUTPUT:
Sub:10

RESULT:
   Thus, the Java program using a user-defined package to perform subtraction of two numbers was successfully executed, and the expected output was obtained.
