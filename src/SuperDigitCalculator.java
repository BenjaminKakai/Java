import java.util.Scanner;

// Define a class named SuperDigitCalculator
public class SuperDigitCalculator {

    // Define a private static method computeSuperDigit that calculates the super digit of an integer
    private static int computeSuperDigit(int n) {
        // Check if the number is a single digit by checking if it's less than 10
        // If it is, that single digit is the super digit
        if (n < 10) {
            return n; // Return the number itself as the super digit
        }
        // If the number is not a single digit, initialize a sum variable to 0
        int sum = 0;
        // Use a while loop to iterate as long as n is greater than 0
        while (n > 0) {
            sum += n % 10; // Add the last digit of n to sum (n % 10 gives the last digit)
            n /= 10;       // Remove the last digit from n by dividing it by 10
        }
        // After the sum of all digits is calculated, call computeSuperDigit recursively
        // with the sum of digits to break it down further until a single digit is obtained
        return computeSuperDigit(sum);
    }

    // The main method - the entry point of the program
    public static void main(String[] args) {
        // Create an instance of Scanner to read input from the console
        Scanner sc = new Scanner(System.in);
        // Read the first number as n
        int n = sc.nextInt();
        // Read the second number as k
        int k = sc.nextInt();
        // Close the scanner object as we no longer need to read inputs
        sc.close();

        // Calculate the super digit of the original number n
        int superDigitOfN = computeSuperDigit(n);
        // Multiply the super digit of n by k, and compute the super digit of this product
        int result = computeSuperDigit(superDigitOfN * k);
        // Print the final result, which is the super digit of the product
        System.out.println(result);
    }
}
