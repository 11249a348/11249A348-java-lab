Aim:
  To write a Java program to check whether a given number is an Armstrong number or not.

Algorithm:
1.Start the program.
2.Read a number from the user.
3.Store the original number in a variable.
4.Find the number of digits in the given number.
5.Extract each digit using the modulus (%) operator.
6.Raise each digit to the power of the number of digits and add the values.
7.Repeat until all digits are processed.
8.Compare the calculated sum with the original number.
9.If both are equal, display Armstrong number; otherwise, display not an Armstrong number.
10.Stop the program.

program:
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}

output:
Enter a number: 153
153 is an Armstrong number

 Result:
     Thus, the Java program was successfully executed to check whether the given number is an Armstrong number or not.   
