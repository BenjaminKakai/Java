import java.util.*;

public class StringMatcher {

    public static void main(String[] args) {
        // Sample Input
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        // Sample Output
        List<Integer> results = matchingStrings(strings, queries);
        for (int result : results) {
            System.out.println(result);
        }
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> results = new ArrayList<>();

        // Create a map to store the frequency of each string in the strings list
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // For each query, get its frequency from the map and add to results
        for (String query : queries) {
            results.add(frequencyMap.getOrDefault(query, 0));
        }

        return results;
    }
}
