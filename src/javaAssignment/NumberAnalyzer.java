package javaAssignment;


public class NumberAnalyzer {

    /**
     * This method uses a loop to display numbers counting backwards from 10 down to 1.
     */
    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * Iterates through numbers 1 to 10, checking each one to print if it is an Even or Odd number.
     */
    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "-> Even");
            } else {
                System.out.println(i + "-> Odd");
            }
        }
    }

    /**
     * Evaluates the provided integer to categorize its type.
     *
     * @param number the integer value we want to check its type.
     * @return a String which is either "Positive", "Negative", or "Zero" based on the value.
     */
    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Adds two integer values together and gives back the total.
     *
     * @param number1 the first number for the addition operation.
     * @param number2 the second number for the addition operation.
     * @return an integer representing the combined total of both numbers.
     */
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }
}
