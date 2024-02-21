public class Break {
    public static void main (String[] args) {
        int n  = 0;

        while ( n < 10) {

            System.out.println(n);

            if (n == 4) {
                break;
            }
            n++;

        }

        System.out.println("Loop exited. ");

    }
}
