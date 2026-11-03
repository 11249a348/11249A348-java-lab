AIM:
   To write a Java program using a user-defined package named mul to perform the multiplication of two numbers.

ALGORITHM:
1.Start the program.
2.Create a package named mul.
3.Define a public class named Mul.
4.Declare an integer variable res to store the result.
5.Define a method named mulop(int a, int b).
6.Perform multiplication using res = a * b.
7.Display the result using the System.out.println() statement.
8.Create an object of the Mul class in the main program and call the mulop() method with values 20 and 10.
9.Stop the program.

PROGRAM:
package mul;
public class Mul
{
int res;
public void mulop(int a,int b)
{
res = a * b;
System.out.println("Mul :"+res);
}
}

OUTPUT:
Mul :200

RESULT:
    Thus, the Java program using a user-defined package to perform multiplication of two numbers was successfully executed, and the expected output was obtained.
