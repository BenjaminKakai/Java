
import java.util.Scanner;

public class SuperDigit {
    private static int getDigit (int n) {
        if (n < 10) {
            return n;
        }

        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return getDigit(sum);
    }

    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int k = Sc.nextInt();
        Sc.close();


        int superDigit = getDigit(n);
        int result = getDigit(superDigit * k);
        System.out.println(result);
    }

}