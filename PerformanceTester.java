import java.util.List;

public class PerformanceTester {

    public static long measureInsertionTime(List<Integer> list, int numberOfElements) {
        long startTime = System.currentTimeMillis();

        // Insert elements at the beginning of the list
        for (int i = 0; i < numberOfElements; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long measureRandomAccessTime(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();

        // Access an element at a specific index
        int element = list.get(index);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long measureDeletionTime(List<Integer> list, int numberOfElements) {
        long startTime = System.currentTimeMillis();

        // Remove elements from the beginning of the list
        for (int i = 0; i < numberOfElements; i++) {
            list.remove(0);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
