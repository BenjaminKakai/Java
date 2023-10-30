final class FinalClass {
    // This class cannot be extended due to the 'final' keyword
}

class UsingFinal {
    // Final variable (constant)
    public final String FINAL_MESSAGE = "This is a final variable.";

    // Final method
    public final void displayFinalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }
}

// Uncommenting the line below will cause an error as FinalClass cannot be extended.
// class ExtendedClass extends FinalClass {}
