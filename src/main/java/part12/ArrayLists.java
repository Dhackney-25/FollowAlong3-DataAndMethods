package part12;
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayLists {
    public static void main(String[] args) {
        // Creates an ArrayList that stores Strings
        ArrayList<String> food = new ArrayList<String>();
        // Adds "pizza" to the food list
        food.add("pizza");
        // Adds "hamburger" to the food list
        food.add("hamburger");
        // Adds "hotdog" to the food list
        food.add("hotdog");
        // Loops through the list using an index
        for (int i = 0; i < food.size(); i++) {
            // Prints the food item at the current index
            System.out.println(food.get(i));
        }
        // Replaces the first item (index 0) with "sushi"
        food.set(0, "sushi");
        // Prints the updated food list
        System.out.println(food);
        // Removes the third item (index 2), which is "hotdog"
        food.remove(2);
        // Prints the list after removing "hotdog"
        System.out.println(food);
        // Removes all items from the food list
        food.clear();
        // Prints the empty food list
        System.out.println(food);
    }
}

