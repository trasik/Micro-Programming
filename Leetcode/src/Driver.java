package src;

import problems.MergeSortedArray;
import problems.RemoveElement;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        testMergeSortedArray();
        testRemoveElement();
    }

    public static void testMergeSortedArray() {
        System.out.println("88. Merge Sorted Array\n");
        MergeSortedArray msa1 = new MergeSortedArray(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        MergeSortedArray msa2 = new MergeSortedArray(new int[] {1}, 1, new int[] {}, 0);
        MergeSortedArray msa3 = new MergeSortedArray(new int[] {0}, 0, new int[] {1}, 1);

        msa1.solve();
        msa2.solve();
        msa3.solve();

        System.out.println(Arrays.toString(msa1.getNums1()));
        System.out.println(Arrays.toString(msa2.getNums1()));
        System.out.println(Arrays.toString(msa3.getNums1()));
        System.out.println();
    }

    public static void testRemoveElement() {
        System.out.println("27. Remove Element\n");
        RemoveElement re1 = new RemoveElement(new int[] {3,2,2,3}, 3);
        RemoveElement re2 = new RemoveElement(new int[] {0,1,2,2,3,0,4,2}, 2);

        System.out.println(re1.solve());
        System.out.println(re2.solve());
        System.out.println();
    }
}
