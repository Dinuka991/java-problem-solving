package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwoNumSum(new int[]{1, 3, 3, 4, 5}, 7)));
    }

    public static int[] findTwoNumSum(int[] arr,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0 ; i < arr.length-1; i++){
            int compliment = target - arr[i];

            if(hashMap.containsKey(compliment)){
                return new int[] {i, hashMap.get(compliment)};
            }

            hashMap.put(arr[i],i);
        }
        return  new int[] {-1};
    }

}
