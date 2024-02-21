import java.util.Scanner;

public class Superab {
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
        Scanner Sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please input arguments n and k to calculate the superDigit or input -1 to exit the program");
            int n = Sc.nextInt();
            if (n == -1) {
                System.out.println("Exiting program");
                break;
            }

            int k = Sc.nextInt();
            int i = superDigit(n);
            int results = superDigit(i * k);
            System.out.println(results);
        }

        Sc.close();
    }
}