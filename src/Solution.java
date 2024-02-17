import java.io.*;
import java.util.*;

public class Solution {
    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);
        int q = Sc.nextInt();
        Sc.nextLine();

        while (q-- >0) {
            String s = Sc.nextLine();
            System.out.println(palindromeIndex(s));
        }
    }

    public static int palindromeIndex(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j && s.charAt(i) == s.charAt(j)) {

            i++;
            j--;
        }

        if (i >= j) {
            return 1;
        }

        if (isPalindrome(s, i + 1, j)) {
            return i;
        }

        if(isPalindrome(s, i, j - 1)) {
            return j;
        }

        return -1;
    }


    public static boolean isPalindrome(String s, int i, int j) {

        while(i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return true;
            }

            i++;
            j--;
        }

        return false;
    }
}