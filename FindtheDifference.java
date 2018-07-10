package leetcode;

public class FindtheDifference {
    public static char findTheDifference(String s, String t){
        char c = t.charAt(t.length()-1);

        for (int i = 0; i < s.length(); i++)
        {
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }

        return c;
    }

    public static void main(String[] args){
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
