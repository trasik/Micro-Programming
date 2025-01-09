package problems;

public class RemoveDuplicatesFromSortedArray2 {

    private int[] nums;

    public RemoveDuplicatesFromSortedArray2(int[] nums) {
        this.nums = nums;
    }

    public int solve() {
        int dupeIndex = 0;

        for(int n: nums) {
            if(dupeIndex < 2 || n > nums[dupeIndex - 2]) {
                nums[dupeIndex++] = n;
            }
        }

        return dupeIndex;
    }
}
