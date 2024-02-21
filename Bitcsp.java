import java.util.Scanner;

public class Bitcsp {
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
            System.out.println("Type the values and press enter key to calculate the superDigit. To exit the program, enter -1 then press the enter key");
             int n = Sc.nextInt();
             if (n == -1) {
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