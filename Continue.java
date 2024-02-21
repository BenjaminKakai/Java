public class Continue {
    public static void main(String[] args) {
        int n = 0;

        while (n < 10) {
            n++;

            if (n == 4) {
                continue;
            }

            System.out.println(n);
        }

        System.out.println("Loop exited.");
    }
}
