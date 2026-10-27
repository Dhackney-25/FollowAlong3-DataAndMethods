package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        rewatch 2:40:18–2:45:29 (overloading) or 2:45:54–2:56:50 (printf)
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Your extra methods (twice, area) go INSIDE this class, but OUTSIDE main.

public class Stretch {
        public static void main(String[] args) {

            // Exercise 1: Test the overloaded twice methods.
            System.out.println(twice(3));
            System.out.println(twice(2.5));
            System.out.println(twice("ab"));

            // Exercise 2: Print formatted numbers.
            System.out.printf("[%5d]%n", 42);
            System.out.printf("[%-5d]%n", 42);
            System.out.printf("[%.1f]%n", 3.14159);
            System.out.printf("[%,d]%n", 1234567);

            // Exercise 3: Print a pizza order.
            String item = "Pizza";
            int qty = 2;
            double price = 12.5;

            System.out.printf("%-10s x%d  $%.2f%n",
                    item, qty, price * qty);

            // Exercise 4: Print the areas.
            System.out.printf("Square:    %d%n", area(4));
            System.out.printf("Rectangle: %d%n", area(3, 5));
            System.out.printf("Circle:    %.2f%n", area(2.0));

            // Exercise 5: Print the receipt header.
            System.out.printf("%-10s%3s%8s%n",
                    "Item", "Qty", "Cost");

            // Print the receipt items.
            System.out.printf("%-10s%3d%8.2f%n", "Pizza", 2, 25.00);
            System.out.printf("%-10s%3d%8.2f%n", "Wings", 10, 12.99);
            System.out.printf("%-10s%3d%8.2f%n", "Soda", 3, 4.50);

            // Print the receipt total.
            System.out.printf("%-10s%3s%8.2f%n", "TOTAL", "", 42.49);
        }

        // Doubles an integer.
        static int twice(int n) {
            return n * 2;
        }

        // Doubles a decimal number.
        static double twice(double n) {
            return n * 2;
        }

        // Repeats a String twice.
        static String twice(String s) {
            return s + s;
        }

        // Calculates the area of a square.
        static int area(int side) {
            return side * side;
        }

        // Calculates the area of a rectangle.
        static int area(int width, int height) {
            return width * height;
        }

        // Calculates the area of a circle.
        static double area(double radius) {
            return Math.PI * radius * radius;
        }
    }

