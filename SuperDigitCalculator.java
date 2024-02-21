import java.util.Scanner;

public class SuperDigitCalculator {
    private static int superDigit(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return superDigit(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter n and k to get the super digit (or enter -1 to exit):");
            int n = sc.nextInt();
            if (n == -1) {
                System.out.println("Exiting program.");
                break;
            }
            int k = sc.nextInt(); // Assumes the user enters k right after n before pressing enter.

            // No need to check for k == -1 for exit here, since n is the primary trigger for exiting.
            int initialSuperDigit = superDigit(n);
            int result = superDigit(initialSuperDigit * k);
            System.out.println("Super digit: " + result);
        }
        sc.close();
    }
}
