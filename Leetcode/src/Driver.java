package src;

import problems.*;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        testMergeSortedArray();
        testRemoveElement();
        testRemoveDuplicatesFromSortedArray();
        testRemoveDuplicatesFromSortedArray2();
        testMajorityElement();
        testRotateArray();
        testBuyTimeToBuyAndSellStock();
        testBuyTimeToBuyAndSellStock2();
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

    public static void testRemoveDuplicatesFromSortedArray() {
        System.out.println("26. Remove Duplicates from Sorted Array\n");
        RemoveDuplicatesFromSortedArray rdfsa1 = new RemoveDuplicatesFromSortedArray(new int[] {1,1,2});
        RemoveDuplicatesFromSortedArray rdfsa2 = new RemoveDuplicatesFromSortedArray(new int[] {0,0,1,1,1,2,2,3,3,4});

        System.out.println(rdfsa1.solve());
        System.out.println(rdfsa2.solve());
        System.out.println();
    }

    public static void testRemoveDuplicatesFromSortedArray2() {
        System.out.println("80. Remove Duplicates from Sorted Array 2\n");
        RemoveDuplicatesFromSortedArray2 rdfsa1 = new RemoveDuplicatesFromSortedArray2(new int[] {1,1,1,2,2,3});
        RemoveDuplicatesFromSortedArray2 rdfsa2 = new RemoveDuplicatesFromSortedArray2(new int[] {0,0,1,1,1,1,2,3,3});

        System.out.println(rdfsa1.solve());
        System.out.println(rdfsa2.solve());
        System.out.println();
    }

    public static void testMajorityElement() {
        System.out.println("169. Majority Element\n");
        MajorityElement me1 = new MajorityElement(new int[] {3,2,3});
        MajorityElement me2 = new MajorityElement(new int[] {2,2,1,1,1,2,2});

        System.out.println(me1.solve());
        System.out.println(me2.solve());
        System.out.println();
    }

    public static void testRotateArray() {
        System.out.println("189. Rotate Array\n");
        RotateArray ra1 = new RotateArray(new int[] {1,2,3,4,5,6,7}, 3);
        RotateArray ra2 = new RotateArray(new int[] {-1,-100,3,99}, 2);

        ra1.solve();
        ra2.solve();

        System.out.println(Arrays.toString(ra1.getNums()));
        System.out.println(Arrays.toString(ra2.getNums()));
        System.out.println();
    }

    public static void testBuyTimeToBuyAndSellStock() {
        System.out.println("121. Best Time to Buy and Sell Stock\n");
        BestTimeToBuyAndSellStock btbss1 = new BestTimeToBuyAndSellStock(new int[] {7,1,5,3,6,4});
        BestTimeToBuyAndSellStock btbss2 = new BestTimeToBuyAndSellStock(new int[] {7,6,4,3,1});

        System.out.println(btbss1.solve());
        System.out.println(btbss2.solve());
        System.out.println();
    }

    public static void testBuyTimeToBuyAndSellStock2() {
        System.out.println("122. Best Time to Buy and Sell Stock 2\n");
        BestTimeToBuyAndSellStock2 btbss1 = new BestTimeToBuyAndSellStock2(new int[] {7,1,5,3,6,4});
        BestTimeToBuyAndSellStock2 btbss2 = new BestTimeToBuyAndSellStock2(new int[] {1,2,3,4,5});
        BestTimeToBuyAndSellStock2 btbss3 = new BestTimeToBuyAndSellStock2(new int[] {7,6,4,3,1});

        System.out.println(btbss1.solve());
        System.out.println(btbss2.solve());
        System.out.println(btbss3.solve());
        System.out.println();
    }
}
