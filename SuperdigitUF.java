import java.util.Scanner;

public class SuperdigitUF {
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
        Scanner SC = new Scanner(System.in);
        while (true) {
            System.out.println("Please input the two intergers n and k to calculate the superDigit. Else, enter int '-1' to exit the program");

            int n = SC.nextInt();
            if (n == - 1) {
                break;
            }

            int k = SC.nextInt();

            int i  = superDigit(n);
            int results  = superDigit(i * k);
            System.out.println(results);
        }

        SC.close();
    }
}
