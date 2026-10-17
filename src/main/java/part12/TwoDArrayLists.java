package part12;
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrayLists {
    public static void main(String[] args) {
        // Creates an ArrayList for bakery items
        ArrayList<String> bakeryList = new ArrayList<String>();
        // Adds "pasta" to the bakery list
        bakeryList.add("pasta");
        // Adds "garlic bread" to the bakery
        bakeryList.add("garlic bread");
        // Adds "donuts" to the bakery list
        bakeryList.add("donuts");
        // Creates an ArrayList for produce items
        ArrayList<String> produceList = new ArrayList<String>();
        // Adds "tomatoes" to the produce list
        produceList.add("tomatoes");
        // Adds "zucchini" to the produce list
        produceList.add("zucchini");
        // Adds "peppers" to the produce list
        produceList.add("peppers");
        // Creates an ArrayList for drinks
        ArrayList<String> drinksList = new ArrayList<String>();
        // Adds "soda" to the drinks list
        drinksList.add("soda");
        // Adds "coffee" to the drinks list
        drinksList.add("coffee");
        // Prints the entire bakery list
        System.out.println(bakeryList);
        // Prints the first item in the bakery list (index 0)
        System.out.println(bakeryList.get(0));
        // Prints the entire drinks list
        System.out.println(drinksList);
        // Creates a 2D ArrayList to store multiple grocery lists
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // Adds the bakery list as the first list
        groceryList.add(bakeryList);
        // Adds the produce list as the second list
        groceryList.add(produceList);
        // Adds the drinks list as the third list
        groceryList.add(drinksList);
        // Prints the entire grocery list, including all three lists
        System.out.println(groceryList);
        // Prints the first list (bakery items)
        System.out.println(groceryList.get(0));
        // Prints the first item in the first list ("pasta")
        System.out.println(groceryList.get(0).get(0));
        // Prints the second item in the third list ("coffee")
        System.out.println(groceryList.get(2).get(1));
    }
}


