package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        rewatch "overloaded methods" (about 2:40:18) and "printf" (about 2:45:54)
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the THREE methods below. (tag has two versions. That is
// this part's topic: overloading.) Then run ChallengeTest until every test is green.
// Change only the lines marked YOUR CODE.

public class Challenge {
    public static String tag(String name, String text) {
        return "<" + name + ">" + text + "</" + name + ">";
    }

    public static String tag(String text) {
        return tag("b", text);
    }

    public static String money(double amount) {
        return "$" + String.format("%.2f", amount);
    }
}
