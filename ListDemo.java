import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int numberOfElements = 10000;
        int randomAccessIndex = numberOfElements / 2;

        // Measure insertion time
        long arrayListInsertionTime = PerformanceTester.measureInsertionTime(arrayList, numberOfElements);
        long linkedListInsertionTime = PerformanceTester.measureInsertionTime(linkedList, numberOfElements);

        // Measure random access time
        long arrayListAccessTime = PerformanceTester.measureRandomAccessTime(arrayList, randomAccessIndex);
        long linkedListAccessTime = PerformanceTester.measureRandomAccessTime(linkedList, randomAccessIndex);

        // Measure deletion time
        long arrayListDeletionTime = PerformanceTester.measureDeletionTime(arrayList, numberOfElements);
        long linkedListDeletionTime = PerformanceTester.measureDeletionTime(linkedList, numberOfElements);

        // Print results
        System.out.println("Performance Analysis (Time in milliseconds):");
        System.out.println("Operation\t\tArrayList\tLinkedList");
        System.out.println("------------------------------------------------------");
        System.out.println("Insertion\t\t" + arrayListInsertionTime + "\t\t" + linkedListInsertionTime);
        System.out.println("Random Access\t\t" + arrayListAccessTime + "\t\t" + linkedListAccessTime);
        System.out.println("Deletion\t\t" + arrayListDeletionTime + "\t\t" + linkedListDeletionTime);
    }
}
