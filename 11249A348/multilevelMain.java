Aim:
  To write a Java program to demonstrate multilevel inheritance using three classes: Animal, Dog, and Puppy.

Algorithm:
1.Start the program.
2.Create a class Animal with the eat() method.
3.Create a class Dog that extends Animal and define the bark() method.
4.Create a class Puppy that extends Dog and define the play() method.
5.Create an object of the Puppy class.
6.Call the eat(), bark(), and play() methods using the Puppy object.
7.Display the output.
8.Stop the program.

program:
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class multilevelMain {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}

output:
Animal eats
Dog barks
Puppy plays

Result:
    Thus, the Java program to demonstrate multilevel inheritance was successfully executed.
