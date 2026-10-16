package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6233s
//        rewatch 1:43:53 (getting one element) and 1:48:37 (looping through an array)
// Guide: GUIDE.md in this folder, steps 2 and 6
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part10/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.

public class Challenge {

    public static boolean endsWith(int[] nums, int target) {
        return nums[0] == target || nums[nums.length - 1] == target;
    }

    public static int total(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
