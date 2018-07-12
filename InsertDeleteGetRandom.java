package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom {

    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> list;
    Random random;

    /** Initialize your data structure here. */
    public InsertDeleteGetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.remove(val);
        int lastVal = list.remove(list.size() - 1);
        if (index != list.size()) { // !!!因为list已经删过一个点，所以现在的index = size()就是原来队列的最后一个
            list.set(index, lastVal);
            map.put(lastVal, index);
        }
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        int i = map.remove(1);
        System.out.println(i);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        int j = list.remove(1);
        System.out.println(j);
    }
}
