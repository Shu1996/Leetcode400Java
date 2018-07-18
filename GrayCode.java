package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        // G(i) = i ^ (i / 2)
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) { // n has 1<<n code
            list.add(i ^ i >> 1);
        }
        return list;
    }
}
