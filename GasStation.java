package leetcode;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // 如果一个数组的总和非负，那么一定可以找到一个起始位置，从他开始绕数组一圈，累加和一直都是非负的
        if (gas.length == 0 || cost.length == 0 || gas.length != cost.length) {
            return -1;
        }

        int total = 0; // total +- gas of the circle
        int remain = 0; // remained gas
        int start = 0; // start point

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            if (remain < 0) { // if remain is not enough to reach point i, start from this point.
                start = i;
                remain = gas[i] - cost[i];
            } else { // if remain is enough to reach point i, go ahead.
                remain += (gas[i] - cost[i]);
            }
        }

        return total < 0 ? -1 : start;
    }
}
