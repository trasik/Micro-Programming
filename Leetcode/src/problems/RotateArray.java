package problems;

public class RotateArray {

    private int[] nums;
    private int k;

    public RotateArray(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public void solve() {
        if(this.nums.length == 0) return;

        this.k = this.k % this.nums.length;

        reverse(0, this.nums.length - 1);
        reverse(this.k, this.nums.length - 1);
        reverse(0, this.k - 1);
    }

    private void reverse(int start, int end) {
        while(start < end) {
            int holding = nums[start];
            nums[start++] = nums[end];
            nums[end--] = holding;
        }
    }

    public int[] getNums() {
        return nums;
    }
}
