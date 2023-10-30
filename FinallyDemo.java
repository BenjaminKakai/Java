public class FinallyDemo {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause an ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This 'finally' block always executes.");
        }
    }
}
