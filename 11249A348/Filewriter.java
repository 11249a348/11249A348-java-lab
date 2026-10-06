Aim:
  To write a Java program to write characters from A to Z into a file using the FileWriter class.

Algorithm:
1.Start the program.
2.Create a FileWriter object for sample2.txt.
3.Use a for loop with character values from 65 to 90.
4.Write each character into the file using write().
5.Close the file using close().
6.Handle exceptions using the catch block.
7.Stop the program.

program:
import java.io.*;
class Filewriter
{
public static void main(String[]args)
{
try
{
FileWriter fw= new
FileWriter("sample2.txt"); 
for(char i=65;i<91;i++)
{
fw.write(i);
}
fw.close();
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}

output:
The program does not display anything on the console.
The file sample2.txt will contain:
ABCDEFGHIJKLMNOPQRSTUVWXYZ

Result:
    Thus, the Java program to write characters from A to Z into a file using FileWriter was successfully executed.
