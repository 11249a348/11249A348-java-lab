Aim:
   To write a Java program using packages to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

Algorithm:
1.Start the program.
2.Import the packages add, sub, mul, and div.
3.Create objects for the classes Add, Sub, Mul, and Div.
4.Call the respective methods with the values 20 and 10.
5.Perform addition, subtraction, multiplication, and division.
6.Display the results.
7.Stop the program.

program:   
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

output:
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2

  Result:
      Thus, the Java program was successfully executed using packages to perform addition, subtraction, multiplication, and division operations.
