package leetcode;

public class ShortestWordDistanceIII {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int res = words.length;
        int p1 = -1; // index of word1
        int p2 = -1; // index of word2
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                p1 = i;
            }
            if (words[i].equals(word2)) {
                if (words[i].equals(word1)) {
                    p1 = p2;
                }
                p2 = i;
            }
            if (p1 != -1 && p2 != -1) {
                res = Math.min(res, Math.abs(p1 - p2));
            }
        }
        return res;
    }
}
