package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9954s
//        starts at about 2:45:54 — stop at about 2:56:50, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 14, video 2 — the printf method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Printf.
//    Leave the "package part14;" line and the "public class Printf" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Printf {
    public static void main(String[] args) {
        // Creates a boolean variable that stores true or false.
        boolean myBoolean = true;
        // Creates a char variable that stores the character '@'.
        char myChar = '@';
        // Creates a String variable that stores the text "Bro".
        String myString = "Bro";
        // Creates an int variable that stores the whole number 50.
        int myInt = 50;
        // Creates a double variable that stores the decimal number 1000.0.
        double myDouble = 1000;
        // Prints the boolean value using %b.
        System.out.printf("%b\n", myBoolean);
        // Prints the character using %c.
        System.out.printf("%c\n", myChar);
        // Prints the String using %s.
        System.out.printf("%s\n", myString);
        // Prints the integer using %d.
        System.out.printf("%d\n", myInt);
        // Prints the double using %f, which displays six decimal places by default.
        System.out.printf("%f\n", myDouble);
        // Prints "Bro" in a field that is 10 characters wide, right-aligned.
        System.out.printf("Hello %10s\n", myString);
        // Prints "Bro" in a field that is 10 characters wide, left-aligned.
        System.out.printf("Hello %-10s!\n", myString);
        // Prints the money value with six decimal places by default.
        System.out.printf("You have this much money %f\n", myDouble);
        // Prints the money value with exactly two digits after the decimal point.
        System.out.printf("You have this much money %.2f\n", myDouble);
        // Prints the money value with exactly one digit after the decimal point.
        System.out.printf("You have this much money %.1f\n", myDouble);
        // Prints the money value in a field 20 characters wide, left-aligned.
        System.out.printf("You have this much money %-20f!\n", myDouble);
        // Prints the money value in a field 20 characters wide, right-aligned.
        System.out.printf("You have this much money %20f!\n", myDouble);
        // Prints a plus sign before the positive number.
        System.out.printf("You have this much money %+f\n", myDouble);
        // Prints a minus sign before the negative number.
        System.out.printf("You have this much money %+f\n", -myDouble);
        // Prints the number in a 20-character field, padding with zeros.
        System.out.printf("You have this much money %020f\n", myDouble);
        // Prints the number with commas separating thousands.
        System.out.printf("You have this much money %,f\n", myDouble);
    }
}

