package leetcode75.string.string;

import java.util.*;

public class ReverseVowels {
    public String reverseVowels(String s) {
        // Define a set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        // Use two pointers to find vowels and swap them
        while (left < right) {
            // Move the left pointer until it points to a vowel
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            // Move the right pointer until it points to a vowel
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers towards each other
            left++;
            right--;
        }

        // Convert the character array back to a string and return
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseVowels solution = new ReverseVowels();
        System.out.println(solution.reverseVowels("IceCreAm"));  // Output: "AceCrIm"
        System.out.println(solution.reverseVowels("leetcode"));  // Output: "leotcede"
    }
}
