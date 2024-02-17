public class StarPattern {
    public static void main(String[] args) {
        int size = 10; // This is the height of the star and can be adjusted.

        // The width of the star pattern
        int width = (2 * size) - 1;

        // Loop for each row
        for (int i = 0; i < size; i++) {
            // Loop for each column in the row
            for (int j = 0; j < width; j++) {
                // Printing star at the first, last, or diagonal positions
                if (j == size - 1 - i || j == size - 1 + i || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing one row
            System.out.println();
        }
    }
}
