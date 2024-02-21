public class Superss {
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
        if (args.length < 2) {
            System.out.println("Please provide n and k as command-line arguments.");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            int k = Integer.parseInt(args[1]);

            // Initially calculate the super digit of n
            int initialSuperDigit = superDigit(n);
            // Then, calculate the super digit of the product of the initial super digit and k
            int result = superDigit(initialSuperDigit * k);
            System.out.println("Super digit: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Both n and k must be integers.");
        }
    }
}
