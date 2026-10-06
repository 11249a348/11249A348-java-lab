Aim:
  To write a Java program to find the largest number, smallest number, and sum of elements in an array.

Algorithm:
1.Start the program.
2.Declare and initialize an integer array with 10 elements.
3.Initialize sum = 0.
4.Set the first array element as both min and max.
5.Traverse the array using a for loop.
6.If the current element is greater than max, update max.
7.If the current element is smaller than min, update min.
8.Add each array element to sum.
9.Display the sum, largest number, and smallest number.
10.Stop the program.

program:
public class LargestSmallest
{
public static void main(String[] args)
{
int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
int sum = 0;
int min = a[0];
int max = a[0];
for (int i = 1; i < a.length; i++)
{
if (a[i] > max)
{
max = a[i];
}
if (a[i] < min)
{
min = a[i];
}
sum = sum + a[i];
}
System.out.println("The sum is : " + sum);
System.out.println("Largest Number in a given array is : " + max);
System.out.println("Smallest Number in a given array is : " + min);
}
}

output:
The sum is : 357
Largest Number in a given array is : 90
Smallest Number in a given array is : 9

Result:
     Thus, the Java program to find the sum, largest number, and smallest number in a given array was successfully executed.
