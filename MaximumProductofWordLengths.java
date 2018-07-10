package leetcode;

public class MaximumProductofWordLengths {
    public static int maxProduct(String[] words){
        int res = 0;
        int[] bytes = new int[words.length];

        // create bytes of every character
            for (int i = 0; i < words.length; i++)    // i is the ith word of words
        {
            int val = 0;    // restore the binary code of the word
            for (int j = 0; j < words[i].length(); j++)
                val |= 1<<(words[i].charAt(j)-'a');
            bytes[i] = val;
        }

            for (int i = 0; i < words.length; i++)      //check if two words have common letters
        {
            for (int j = i+1; j < words.length; j++)
            {
                if ((bytes[i] & bytes[j]) == 0)
                    res = Math.max(res, words[i].length()*words[j].length());
            }
        }

            return res;
    }

    public static void main(String[] args)
    {
        String[] str = {"a","bec"};
        System.out.println(maxProduct(str));
    }
}
