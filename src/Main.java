import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 5, 4};
        System.out.println(Arrays.toString(twoNumberSum(arr, 4)));
        System.out.println(reverseString("fuck"));
        System.out.println(isPalindrom("amma"));

    }

    /*
    Problem: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    */

    public static int[] twoNumberSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Add the current number and its index to the map
            map.put(arr[i], i);
        }

        // Throw an exception if no solution is found
        throw new IllegalArgumentException("No solution found");
    }

    /*
    Reverse string
     */

    public static String reverseString(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return new String(str);
    }

    /*
      Palindrome check
     */

    public static boolean isPalindrom(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }















}
