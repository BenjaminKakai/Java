public class MixedArray {
    public static void main (String[] args) {
        Object[] mixedArray = new Object[5];

        mixedArray[0] = "Benjamin";
        mixedArray[1] = "123";
        mixedArray[2] = "123.34";
        mixedArray[3] = "342.446890";
        mixedArray[4] = "A";

        for (Object Kakai: mixedArray) {
            System.out.println(Kakai);
        }
    }
}