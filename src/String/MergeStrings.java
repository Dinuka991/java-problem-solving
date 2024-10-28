package String;


public class MergeStrings {

    public static void main(String[] args) {
        System.out.println(mergeString("abc", "def"));
    }

    public static String mergeString(String str1 , String str2){

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while ( i < str1.length() && j < str2.length()) {
            sb.append(str1.charAt( i++));
            sb.append( str2.charAt(j++));
        }

        while (i < str1.length()){
            sb.append(str1.charAt(i++));
        }

        while (j < str2.length()) {
            sb.append(str2.charAt(j++));
        }

        return sb.toString();
    }
}
