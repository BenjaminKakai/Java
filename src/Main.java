<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
=======
//class name
public class Main{
    //main method
    public static void main(String[] args){
        //Declare the object(Array of Objects)
        Object[] mixedArray = new Object[5];

        //Assign the values to the elements of the array
        mixedArray[0] = "Benjamin";
        mixedArray[1] = 123;
        mixedArray[2] = 122.00;
        mixedArray[3] = 133.82;
        mixedArray[4] = "A";

        //method to call the mixed elements array
        for(Object elements: mixedArray){
            System.out.println(elements);
        }

    }
}
>>>>>>> 6cfa75b (Practice Folder)
