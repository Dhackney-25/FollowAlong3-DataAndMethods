package part12;
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        starts at about 2:23:57 — stop at about 2:27:20, when he says "that is everything you need to know to get started with the for-each loop"
// Guide: GUIDE.md in this folder, steps 11–13
//
// Part 12 — the for-each loop
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForEachLoop.
//    Leave the "package part12;" line and the "public class ForEachLoop" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForEachLoop {
    public static void main(String[] args) {
        // Creates an array of Strings containing four animals
        String[] animals = {"cat", "dog", "rat", "bird"};
        // Loops through each animal in the array
        for (String i : animals) {
            // Prints the current animal
            System.out.println(i);
        }
        // Creates an empty ArrayList that stores Strings
        ArrayList<String> animalList = new ArrayList<String>();
        // Adds "cat" to the ArrayList
        animalList.add("cat");
        // Adds "dog" to the ArrayList
        animalList.add("dog");
        // Adds "rat" to the ArrayList
        animalList.add("rat");
        // Adds "bird" to the ArrayList
        animalList.add("bird");
        // Loops through each animal in the ArrayList
        for (String i : animalList) {
            // Print the current animal
            System.out.println(i);
        }
    }

}
