Aim:
   To write a Java program to search for a given element in an array using Binary Search.

Algorithm:
1.Start the program.
2.Read the number of elements in the array.
3.Enter the elements of the array.
4.Read the element x to be searched.
5.Set first = 0 and last = n - 1.
6.Find the middle element using mid = (first + last) / 2.
7.Compare the middle element with the search element:
  If a[mid] > x, set last = mid - 1.
  If a[mid] < x, set first = mid + 1.
  If a[mid] == x, the element is found.
8.Repeat until the element is found or first > last.
9.Display the result.
10.Stop the program.

program:
import java.util.Scanner;
class BinarySearch
{
public static void main(String ar[])
{ int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array:");
for(i=0;i<n;++i)
a[i]=sc.nextInt();
System.out.println("Enter element to search:");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
flag=1;
System.out.println("element found");
break;
}
} 
if(flag==0)
System.out.println("element notfound");
}

output:
Enter number of elements:
5
Enter elements of array:
10
20
30
40
50
Enter element to search:
30
element found
}

Result:
     Thus, the Java program was successfully executed to search for an element in an array using Binary Search.
