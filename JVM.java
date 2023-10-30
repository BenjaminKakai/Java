import java.lang.reflect.Method;

public class JVM {

    public void executeByteCode(Object instance, Method byteCode) {
        System.out.println("Interpreting bytecode for method: " + byteCode.getName());
        try {
            byteCode.invoke(instance);
        } catch (Exception e) {
            System.out.println("Error executing bytecode: " + e.getMessage());
        }
    }
}
