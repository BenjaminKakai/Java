package org.example;

public class Main {
    public static void main(String[] args) {
        System
        System.out.println("for (int i = 0; i < n; i++) {\n" +
                "    // Track number of elements swapped during a single array traversal\n" +
                "    int numberOfSwaps = 0;\n" +
                "    \n" +
                "    for (int j = 0; j < n - 1; j++) {\n" +
                "        // Swap adjacent elements if they are in decreasing order\n" +
                "        if (a[j] > a[j + 1]) {\n" +
                "            swap(a[j], a[j + 1]);\n" +
                "            numberOfSwaps++;\n" +
                "        }\n" +
                "    }\n" +
                "    \n" +
                "    // If no elements were swapped during a traversal, array is sorted\n" +
                "    if (numberOfSwaps == 0) {\n" +
                "        break;\n" +
                "    }\n" +
                "}");


    }
}