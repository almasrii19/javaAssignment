package javaAssignment;

/**
 * This class is the entry point of the program.
 * It tests all the methods of the NumberAnalyzer class in sequence.
 */
public class Main {

    /**
     * The main method used to run and test all NumberAnalyzer methods step by step.
     *
     * @param args the command line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Step 1: Testing Method 1
        System.out.println("--- Testing Method 1---");
        NumberAnalyzer.printNumbersDescending();

        // Step 2: Testing Method 2
        System.out.println("--- Testing Method 2---");
        NumberAnalyzer.printEvenOrOdd();

        // Step 3: Testing Method 3
        System.out.println("--- Testing Method 3---");
        int testNumber = 5;
        String typeResult = NumberAnalyzer.checkNumberType(testNumber);
        System.out.println("The number " + testNumber + " is: " + typeResult);

        // Step 4: Testing Method 4
        System.out.println("--- Testing Method 4---");
        int num1 = 10;
        int num2 = 20;
        int sumResult = NumberAnalyzer.calculateSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sumResult);
    }
}
