public class Rectangle {
    public static void main (String[] args) {
        int h = 5;
        int l = 60;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 1 || i == h || j == 1 || j == l) {
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
