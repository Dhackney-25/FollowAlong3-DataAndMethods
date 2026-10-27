package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        starts at about 2:40:18 — stop at about 2:45:29, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 14, video 1 — overloaded methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedMethods.
//    Leave the "package part14;" line and the "public class OverloadedMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class OverloadedMethods {
    // The main method is where the program starts running.
    public static void main(String[] args){
        // Calls the add method with two integers, 1 and 2, and stores the result in x.
        int x = add(1, 2);
        // Prints the value of x, which is 3.
        System.out.println(x);
        // Calls the add method with three integers, 1, 2, and 3, and stores the result in y.
        int y = add(1, 2, 3);
        // Prints the value of y, which is 6.
        System.out.println(y);
        // Calls the add method with four integers, 1, 2, 3, and 4, and stores the result in z.
        int z = add(1, 2, 3, 4);
        // Prints the value of z, which is 10.
        System.out.println(z);
        // Calls the add method with four double values and stores the result in d.
        double d = add(1.0, 2.0, 3.0, 4.0);
        // Prints the value of d, which is 10.0.
        System.out.println(d);
    }
    // Overloaded method #1: accepts two integers and returns their sum.
    static int add(int a, int b) {
        // Prints a message to show that overloaded method #1 was selected.
        System.out.println("This is overloaded method #1");
        // Adds a and b and returns the result.
        return a + b;
    }
    // Overloaded method #2: accepts three integers and returns their sum.
    static int add(int a, int b, int c) {
        // Prints a message to show that overloaded method #2 was selected.
        System.out.println("This is overloaded method #2");
        // Adds a, b, and c and returns the result.
        return a + b + c;
    }
    // Overloaded method #3: accepts four integers and returns their sum.
    static int add(int a, int b, int c, int d) {
        // Prints a message to show that overloaded method #3 was selected.
        System.out.println("This is overloaded method #3");
        // Adds all four integers and returns the result.
        return a + b + c + d;
    }
    // Overloaded method #4: accepts two double values and returns their sum.
    static double add(double a, double b) {
        // Prints a message to show that overloaded method #4 was selected.
        System.out.println("This is overloaded method #4");
        // Adds a and b and returns the result as a double.
        return a + b;
    }
    // Overloaded method #5: accepts three double values and returns their sum.
    static double add(double a, double b, double c) {
        // Prints a message to show that overloaded method #5 was selected.
        System.out.println("This is overloaded method #5");
        // Adds all three double values and returns the result.
        return a + b + c;
    }
    // Overloaded method #6: accepts four double values and returns their sum.
    static double add(double a, double b, double c, double d) {
        // Prints a message to show that overloaded method #6 was selected.
        System.out.println("This is overloaded method #6");
        // Adds all four double values and returns the result.
        return a + b + c + d;
    }
}

