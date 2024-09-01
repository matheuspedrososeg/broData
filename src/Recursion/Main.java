package Recursion;

public class Main {
    public static void main(String[] args) {
        // method to walk a number of steps.
        walk(3);

        // method to find the factorial of a given number.
        System.out.println(factorial(7));

        //method to find the power of a given number.
        int i = power(2, 8);
        System.out.println(i);
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1; // base case.
        return base * power(base, exponent - 1); // recursive case.
    }

    private static int factorial(int number) {
        if (number < 1) return 1; // base case
        return number * factorial(number - 1); // recursive case
    }

    private static void walk(int steps) {
        if (steps < 1) return; // base case.
        System.out.println("You take a step.");
        walk(steps - 1); // recursive case.

    }
}
