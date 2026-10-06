Aim:
   To write a Java program to read and display the contents of a text file using the FileReader class.

Algorithm:
1.Start the program.
2.Create a FileReader object to open sample2.txt.
3.Declare an integer variable i to store the character read from the file.
4.Read the file character by character using read().
5.Continue reading until read() returns -1, which indicates the end of the file.
6.Convert each character into char and display it.
7.Close the file using close().
8.Handle any exception using the catch block.
9.Stop the program.

program:
import java.io.*;
class Filereader
{
public static void main(String[] args)
{

try
{
FileReader fr=new
FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}

Sample sample2.txt
Welcome to Java
File Handling Example
  
output:
W
e
l
c
o
m
e
 
t
o
 
J
a
v
a
F
i
l
e
 
H
a
n
d
l
i
n
g
 
E
x
a
m
p
l
e

Result:
   Thus, the Java program to read and display the contents of a text file using FileReader was successfully executed.
