public class SuperDigitWAS {
    private static int superDigit (int n) {
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

    public static void main (String[] args) {
        if (args.length < 2) {
            System.out.println("Please input two integers to act as arguments when calculating the superDigits. If the two inputs are not being concated, then use 1 as the second variable k ");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            int k = Integer.parseInt(args[1]);

            int i = superDigit(n);
            int results  = superDigit(i * k);
            System.out.println(results);
        }

        catch (NumberFormatException e) {
            System.out.println("The arguments must be integers");
        }
    }
}
