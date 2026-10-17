package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class StringMethods {
    public static void main(String[] args){
        // Creates a String variable called name and stores "Bro"
        String name = "Bro";
        // Checks if name is exactly equal to "Bro"
        boolean equalsResult = name.equals("Bro");
        // Prints true
        System.out.println(equalsResult);

        // Checks if name is equal to "bro" (case-sensitive)
        boolean lowerResult = name.equals("bro");
        // Prints false because B is uppercase
        System.out.println(lowerResult);
        // Checks if name equals "bro", ignoring uppercase and lowercase differences
        boolean ignoreResult = name.equalsIgnoreCase("bro");
        // Prints true
        System.out.println(ignoreResult);
        // Gets the number of characters in name
        int lengthResult = name.length();
        // Prints 3
        System.out.println(lengthResult);
        // Gets the character at index 0 (the first character)
        char charResult = name.charAt(0);
        // Prints B
        System.out.println(charResult);
        // Finds the index of the first occurrence of "o"
        int indexResult = name.indexOf("o");
        // Prints 1
        System.out.println(indexResult);
        // Checks whether name is empty
        boolean emptyResult = name.isEmpty();
        // Prints false because "Bro" is not empty
        System.out.println(emptyResult);
        // Converts name to uppercase
        String upperResult = name.toUpperCase();
        // Prints BRO
        System.out.println(upperResult);
        // Converts name to lowercase
        String lowerCaseResult = name.toLowerCase();
        // Prints bro
        System.out.println(lowerCaseResult);
        // Creates a String with spaces before and after the word
        String spaced = "   Bro   ";
        // Removes whitespace from the beginning and end of the String
        String trimResult = spaced.trim();
        // Prints the original String, including its spaces
        System.out.println("[" + spaced + "]");
        // Prints the trimmed String without the outside spaces
        System.out.println("[" + trimResult + "]");
        // Replaces every occurrence of 'o' with 'a'
        String replaceResult = name.replace('o', 'a');
        // Prints Bra
        System.out.println(replaceResult);

    }

}
