public class Main {
    public static void main(String[] args) {
        // Define the first two numbers in the Fibonacci sequence
        int a = 0;
        int b = 1;

        // Define a variable to hold the element number
        int element = 1;

        // Print the first two numbers in the Fibonacci sequence, along with the element number
        System.out.println(element + ": " + a);
        element++;
        System.out.println(element + ": " + b);
        element++;

        // Define a variable to hold the next number in the sequence
        int c = a + b;

        // Loop until the next number is greater than or equal to 50
        while (c < 50) {
            // Print the next number in the sequence, along with the element number
            System.out.println(element + ": " + c);
            element++;

            // Calculate the next number in the sequence
            a = b;
            b = c;
            c = a + b;
        }
    }
}
