public class ExceptionDemo {

    // A method that declares using 'throws' that it might throw a CustomException
    public static void checkNumber(int number) throws CustomException {
        if (number < 10) {
            // Explicitly 'throw' a new CustomException
            throw new CustomException("Number is less than 10");
        } else {
            System.out.println("Number is valid");
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(5); // This will throw the exception as 5 is less than 10
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            checkNumber(15); // This will not throw the exception as 15 is greater than 10
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
