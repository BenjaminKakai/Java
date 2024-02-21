import java.util.Scanner;

public class randos {
    private static int superDigit (int n) {
        if (n < 10) {
            return n;
        }

        int sum = 0;
        while (n > 10) {
            sum += n % 10;
            n /= 10;
        }

        return superDigit(sum);
    }

    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();
        int k = Sc.nextInt();
        Sc.close();

        int i = superDigit(n);
        int results  = superDigit(i * k);
        System.out.println(results);
    }
}
