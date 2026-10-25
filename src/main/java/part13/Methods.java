package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Methods {
    public static void main(String[] args) {
        // Creates a String variable named name and stores "Bro" in it.
        String name = "Bro";
        // Creates an integer variable named age and stores 21 in it.
        int age = 21;
        // Calls the hello method and passes name and age as arguments.
        hello(name, age);
        // Creates an integer variable named x and stores 3 in it.
        int x = 3;
        // Creates an integer variable named y and stores 4 in it.
        int y = 4;
        // Calls the add method with x and y, then stores the returned sum in z.
        int z = add(x, y);
        // Prints the value stored in z to the console.
        System.out.println(z);
        // Calls the add method with x and y and prints the returned sum directly.
        System.out.println(add(x, y));
    }
    // Defines a method named hello that accepts a String name and an int age.
    static void hello(String name, int age) {
        // Prints "Hello " followed by the name passed into the method.
        System.out.println("Hello " + name);
        // Prints "You are " followed by the age passed into the method.
        System.out.println("You are " + age);
    }
    // Defines a method named add that accepts two integers, x and y, and returns an int.
    static int add(int x, int y) {
        // Adds x and y together and returns the result to the place where the method was called.
        return x + y;
    }
}


