package leetcode75.string.string;

public class ReverseWords {

    public static void main(String[] args) {

        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("the sky is blue"));

    }

  public String reverseWords(String s) {
    String s1 = s.trim();
    String[] arr = s1.split("\\s+");
    StringBuilder sb = new StringBuilder();

    for (int i = arr.length - 1; i >= 0; i--) {
        sb.append(arr[i]);
        if (i != 0) {
            sb.append(" ");
        }
    }
    return sb.toString();
}
}
