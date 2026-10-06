Aim:
  To write a Java program to generate the Fibonacci series for n terms using a method.

Algorithm:
1.Start the program.
2.Read the value of n from the user.
3.Call the Fibonacci() method with n.
4.If n = 0, display 0.
5.If n = 1, display 0 1.
6.Otherwise, initialize a = 0 and b = 1.
7.Display the first two Fibonacci numbers: 0 1.
8.Calculate the next number as a + b.
9.Update a and b with the next two values.
10.Repeat the process until n terms are generated.
11.Stop the program.
     
program:
import java.util.Scanner;
public class Fibonacciseries {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n:");
         int n = sc.nextInt();
         Fibonacci(n);
}
public static void Fibonacci(int n){
    if (n == 0) {
        System.out.println("0");
    } else if (n == 1) {
        System.out.println("0 1");
    } else {
        System.out.println("0 1");
        int a = 0;
        int b = 1;
        for (int i = 1; i < n - 1; i++) {
          int nextnumber = a + b;
          System.out.print(nextnumber+ " ");
          a = b;
          b = nextnumber;
       }
    }
  }
}

output:
Enter the value of n: 7
0 1
1 2 3 5 8

Result:
    Thus, the Java program was successfully executed to generate the Fibonacci series for the given number of terms.
