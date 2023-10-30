import java.lang.reflect.Method;

public class JVMDemo {

    public static void main(String[] args) {
        JavaProgram program = new JavaProgram();
        ByteCodeSimulator compiler = new ByteCodeSimulator();
        JVM jvm = new JVM();

        Method byteCode = compiler.getByteCode(JavaProgram.class);
        jvm.executeByteCode(program, byteCode);
    }
}
