import java.util.Scanner;

public class MaximumSweetSize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input values
        int N = sc.nextInt();  // Number of shops
        int K = sc.nextInt();  // Number of sweet types
        int S = sc.nextInt();  // Budget in rupees

        int[][] A = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int maxSweetSize = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int totalCost = 0;
                int localMaxSize = Integer.MAX_VALUE;

                for (int sweetType = 0; sweetType < K; sweetType++) {
                    int totalIngredientSize = A[i][sweetType] + A[j][sweetType];
                    int cost = (int) Math.ceil((double) localMaxSize / totalIngredientSize);

                    localMaxSize = Math.min(localMaxSize, totalIngredientSize);
                    totalCost += cost;
                }

                if (totalCost <= S) {
                    maxSweetSize = Math.max(maxSweetSize, localMaxSize);
                }
            }
        }

        System.out.println(maxSweetSize);
    }
}
