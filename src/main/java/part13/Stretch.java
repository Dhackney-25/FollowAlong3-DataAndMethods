package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        rewatch 2:28:40–2:35:20 for parameters, 2:35:25–2:39:30 for return types
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it — and your own methods
// underneath it — is part of the stretch.

public class Stretch {
        public static void main(String[] args) {
            // Creates an integer variable x and sets its value to 5.
            int x = 5;
            // Calls the change method and passes x into it.
            change(x);
            // Prints the original value of x, which is still 5.
            System.out.println(x);
            // Calls the twice method to multiply x by 2 and prints the result (10).
            System.out.println(twice(x));
            // Calls twice twice: first 5 * 2 = 10, then 10 * 2 = 20.
            System.out.println(twice(twice(x)));
            // Calls the greet method with "Sam" as the name and 3 as the number of greetings.
            greet("Sam", 3);
        }
    // Defines a method named change that accepts an integer parameter x and returns nothing.
    static void change(int x) {
        // Changes the local copy of x to 100, without changing the original x in main.
        x = 100;
        }
    // Defines a method named twice that accepts an integer n and returns an integer.
    static int twice(int n) {
        // Multiplies n by 2 and returns the result.
        return n * 2;
        }
    // Defines a method named greet that accepts a name and the number of times to greet.
    static void greet(String who, int times) {
        // Starts a loop that repeats as long as i is less than times.
        for (int i = 0; i < times; i++) {
            // Prints a greeting using the name, followed by a space.
            System.out.print("Hi " + who + "! ");
            }
        // Prints a newline after all the greetings have been displayed.
        System.out.println();
        }
    }

