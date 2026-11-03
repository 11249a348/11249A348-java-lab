AIM:
   To write a Java program to perform basic arithmetic operations such as addition, subtraction, multiplication, and division using user-defined packages.

ALGORITHM:
1.Start the program.
2.Import the required packages: add, sub, mul, and div.
3.Create a class naed ArithDemo.
4.Define the main() method.
5.Create objects for the classes Add, Sub, Mul, and Div.
6.Call the addop() method to perform addition of 20 and 10.
7.Call the subop() method to perform subtraction of 20 and 10.
8.Call the mulop() method to perform multiplication of 20 and 10.
9.Call the divop() method to perform division of 20 and 10.
10.Display the results of all arithmetic operations.
11.Stop the program.

PROGRAM:
import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;
public class ArithDemo
{
public static void main(String args[])
{
Add ad = new Add();
Sub su = new Sub();
Mul mu = new Mul();
Div di = new Div();
ad.addop(20,10);
su.subop(20,10);
mu.mulop(20,10);
di.divop(20,10);
}
}

OUTPUT:
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2

RESULT:
     Thus, the Java program to perform basic arithmetic operations using user-defined packages was successfully executed, and the expected results were obtained.
