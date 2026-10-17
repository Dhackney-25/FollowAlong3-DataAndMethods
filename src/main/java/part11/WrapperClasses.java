package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class WrapperClasses {
    public static void main(String[] args){
        // Creates a Boolean object and stores true
        Boolean a = true;
        // Creates a Character object and stores the @ symbol
        Character b = '@';
        // Creates an Integer object and stores 123
        Integer c = 123;
        // Creates a Double object and stores 3.14
        Double d = 3.14;
        // Creates a String variable and stores the text "Bro"
        String e = "Bro";
        // Checks if a is true
        if (a == true) {
            // Prints a message if a is true
            System.out.println("This is true");
        }
        // Checks if b contains the @ character
        if (b == '@') {
            // Prints a message if b is @
            System.out.println("This is true");
        }
    }
}

