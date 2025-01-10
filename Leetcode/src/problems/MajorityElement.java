package problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    private int[] nums;

    public MajorityElement(int[] nums) {
        this.nums = nums;
    }

    public int solve() {
        int majority = this.nums.length / 2;

        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int n : this.nums) {
            frequencies.put(n, frequencies.getOrDefault(n, 0) + 1);
        }

        for(int n: this.nums) {
            if(frequencies.get(n) > majority) return n;
        }

        return -1;
    }
}
