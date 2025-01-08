package problems;

public class MergeSortedArray {

    private int[] nums1;
    private int[] nums2;
    private int m;
    private int n;

    public MergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        this.nums1 = nums1;
        this.m = m;
        this.nums2 = nums2;
        this.n = n;
    }

    public void solve() {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while(p1 >= 0 && p2 >= 0) {
            nums1[p3--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
        }

        while(p2 >= 0) {
            nums1[p3--] = nums2[p2--];
        }
    }

    public int[] getNums1() {
        return nums1;
    }

    public int[] getNums2() {
        return nums2;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}
