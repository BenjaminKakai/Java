public class FinalizeDemo {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("The finalize method has been called.");
    }

    public static void main(String[] args) {
        FinalizeDemo obj = new FinalizeDemo();
        obj = null;  // Dereferencing the object

        // Requesting the JVM to run the Garbage Collector
        System.gc();
    }
}
