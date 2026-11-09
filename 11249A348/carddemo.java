Aim:
  To write a Java program using the CardLayout manager to display multiple buttons, showing one button at a time. When a button is clicked, the next button is displayed.

Algorithm:
1.Start the program.
2.Import the required Java packages such as java.awt, java.applet, and java.awt.event.
3.Create a class named carddemo that extends the Applet class and implements the ActionListener interface.
4.Create a Panel and a CardLayout object.
5.Initialize the Panel and set its layout to CardLayout.
6.Create three buttons: First Button, Second Button, and Third Button.
7.Add the buttons to the Panel with unique names.
8.Register ActionListener for each button.
9.In the actionPerformed() method, use buttonCardLayout.next(buttonPanel) to display the next button.
10.Stop the program

Program:
import java.io.*; 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout; public
void init()
{
buttonPanel=new Panel(); add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout); b1=new
Button("first Button"); b1.addActionListener(this);
buttonPanel.add(b1,"first Button"); b2=new
Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button"); b3=new
Button("third button"); b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}

Output:
CardLayout Demo
First Button
After clicking the button, the next card appears.
Second Button
Third Button

Result:
     Thus, the Java program using the CardLayout manager was successfully executed, and the buttons were displayed one after another when clicked.
