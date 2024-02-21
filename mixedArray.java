public class mixedArray {
    public static void main (String[] args) {
        Object[] mixedArray = new Object[5];


        mixedArray[0] = "benjamin";
        mixedArray[1] = "123";
        mixedArray[2] = "123.45";
        mixedArray[3] = "123.45689";
        mixedArray[4] = "a";

        for (Object i : mixedArray) {
            System.out.println(i);
        }
    }
}
