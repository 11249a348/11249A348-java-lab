Aim:
   To write a Java program to display the names and marks of students who scored 60 or above.

Algorithm:
1.Start the program.
2.Declare arrays to store student names and marks.
3.Create a Scanner object to get input from the user.
4.Read the name and marks of 6 students using a for loop.
5.Store the names and marks in the respective arrays.
6.Traverse the arrays using another for loop.
7.Check whether each student's marks are greater than or equal to 60.
8.If the marks are >= 60, display the student's name and marks.
9.Stop the program.

program:  
import java.util.Scanner;
public class MarksAbvsixty
{
public static void main(String args[])
{
int marks[] = new int[6];
int i;
String name[] = new String[30];
Scanner scanner = new Scanner(System.in);

for(i=0; i<6; i++) {
System.out.print("Enter Name of Student and Marks of Subject"+(i+1)+":");
name[i] = scanner.next();
marks[i] = scanner.nextInt();
}
for(i=0; i<6;i++) {
if(marks[i]>=60)
{
System.out.println(name[i] + " " + marks[i]);
}
}
}
}

output:
Enter Name of Student and Marks of Subject1: Ravi 75
Enter Name of Student and Marks of Subject2: Sita 45
Enter Name of Student and Marks of Subject3: Rahul 80
Enter Name of Student and Marks of Subject4: Priya 55
Enter Name of Student and Marks of Subject5: Anu 60
Enter Name of Student and Marks of Subject6: Kiran 35
Ravi 75
Rahul 80
Anu 60

Result:
   Thus, the Java program to display the names and marks of students who scored 60 or above was successfully executed.
