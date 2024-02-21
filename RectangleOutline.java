public class RectangleOutline {
    public static void main (String[] args) {
        int h = 10;
        int w = 6;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {

                if (i == 1 || i == h || j == 1 || j == w) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
