package hashmap.problems;


import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOccurrence {

    /*
       Given an array of integers arr,  return true if the number of occurrences of
        each value in the array is unique or false otherwise.
     */

    public static void main(String[] args) {

            System.out.println(uniqueOccurrence(new int[]{1,2,2,1,1,3}));
            System.out.println(uniqueOccurrence(new int[]{1,2}));
            System.out.println(uniqueOccurrence(new int[]{1,2,2,1,1,3,3}));
            System.out.println(uniqueOccurrence(new int[]{1,2,2,1,1,3,3,3}));
    }



    public static boolean uniqueOccurrence(int[] arr){

        HashMap<Integer,Integer> occurrenceMap = new HashMap<>();

        // Step 1 - count the occurrence of each value
        for(int value: arr){
            occurrenceMap.put(value,occurrenceMap.getOrDefault(value,0)+1);
        }

        //Step 2 - check if  all the occurrence are unique

        for(int count: occurrenceMap.values()){
            HashSet<Integer> occurrenceSet = new HashSet<>();
            if(!occurrenceSet.add(count)){
                return false;
            }
        }
        return true;

    }



}
