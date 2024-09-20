import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(reverseString("silver"));


    }

    public static String reverseString(String str){

        char[] arr = str.toCharArray();
        int left=0;
        int right = str.length()-1;

        while (left<right){

            char temp =  arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right --;

        }
        return new String(arr);

    }
}
