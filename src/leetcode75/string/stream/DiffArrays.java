package leetcode75.string.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DiffArrays {
    public static void main(String[] args) {
        System.out.println(findTheDiff(new int[]{1, 2, 2, 1, 1, 3}, new int[]{1, 2, 2, 1, 1, 3, 3}));

    }



   public static List<List<Integer>> findTheDiff(int[] arr, int[] arr2) {
    // Convert arrays to sets to remove duplicates and allow set operations
    Set<Integer> set1 = Arrays.stream(arr).boxed().collect(Collectors.toSet());
    Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

    // Find elements in set1 that are not in set2
    List<Integer> diff1 = set1.stream()
                              .filter(num -> !set2.contains(num))
                              .collect(Collectors.toList());

    // Find elements in set2 that are not in set1
    List<Integer> diff2 = set2.stream()
                              .filter(num -> !set1.contains(num))
                              .collect(Collectors.toList());

    // Return the differences as a list of lists
    return Arrays.asList(diff1, diff2);
}
}
