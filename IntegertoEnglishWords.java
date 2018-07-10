package leetcode;

public class IntegertoEnglishWords {
    String[] less20 = new String[]{
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    String[] tens = new String[]{
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    String[] thousands = new String[]{
            "", "Thousand", "Million", "Billion"
    };

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String res = "";
        int i = 0; // for thousands index

        while (num > 0) {
            if (num % 1000 != 0) {
                res = helper(num % 1000) + thousands[i] + " " + res;
            }
            num /= 1000;
            i++;
        }
        return res.trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        }
        if (num < 20) {
            return less20[num] + " ";
        } else if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10);
        } else {
            return helper(num / 100) + "Hundred" + " " + helper(num % 100);
        }
    }
}
