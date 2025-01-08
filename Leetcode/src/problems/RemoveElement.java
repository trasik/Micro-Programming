package problems;

public class RemoveElement {

    private int[] nums;
    private int val;

    public RemoveElement(int[] nums, int val) {
        this.nums = nums;
        this.val = val;
    }

    public int solve() {
        int removeIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != this.val) {
                nums[removeIndex++] = nums[i];
            }
        }

        return removeIndex;
    }
}
