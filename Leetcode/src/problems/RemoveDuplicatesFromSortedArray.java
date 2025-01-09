package problems;

public class RemoveDuplicatesFromSortedArray {

    private int[] nums;

    public RemoveDuplicatesFromSortedArray(int[] nums) {
        this.nums = nums;
    }

    public int solve() {
        int dupeIndex = 0;

        for(int i = 0; i < this.nums.length; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                nums[dupeIndex++] = nums[i];
            }
        }

        return dupeIndex;
    }
}
