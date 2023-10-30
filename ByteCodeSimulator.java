import java.lang.reflect.Method;

public class ByteCodeSimulator {

    public Method getByteCode(Class<?> clazz) {
        // For simplicity, we're getting the first declared method of the provided class
        return clazz.getDeclaredMethods()[0];
    }
}
