package org.example;

import java.util.Arrays;

public class MergeSortArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            insertItem(i, nums1, m);
            m++;
        }
    }

    private static void insertItem(int i, int[] i1, int m) {
        int position = 0;
        boolean isFind = false;
        for (int j = 0; j < m; j++) {
            if (i1[j] > i) {
                position = j;
                System.out.println(position);
                isFind = true;
                break;
            }
        }
        if (isFind) {
            for (int k = m; k > position; k--) {
                int temp = i1[k - 1];
                i1[k] = i1[k - 1];
                i1[k - 1] = temp;
            }
            i1[position]=i;
        }else{
            i1[m]=i;
        }

}

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};

        merge(nums1, 3, nums2, 3);
        System.out.print("Array: [");
        for (int number : nums1) {
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println("]");
    }

}
