import java.util.Scanner;

public class FlippingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            int[][] matrix = new int[n * 2][n * 2];

            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            long sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    sum += Math.max (
                            Math.max(matrix[i][j], matrix[i][n * 2 - j - 1]),
                            Math.max(matrix[n * 2 - i - 1][j], matrix[n * 2 - i - 1][n * 2 - j - 1])
                    );
                }
            }
            System.out.println(sum);
        }
    }
}
