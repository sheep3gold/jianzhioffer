package com.ittest.leetcode;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2};
        double mid = findMedianSortedArrays(nums1, nums2);
        System.out.println(mid);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            if (nums2.length % 2 == 0) {
                return (double) (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2;
            }else {
                return nums2[nums2.length / 2];
            }
        }
        if (nums2.length == 0) {
            if (nums1.length % 2 == 0) {
                return (double) (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2;
            }else {
                return nums1[nums1.length / 2];
            }
        }
        int i = 0, j = 0, m = 0;
        int arr[] = new int[nums1.length + nums2.length];
        int length = (nums1.length + nums2.length) / 2;
        while (m<=length) {
            if (i==nums1.length){
                while (m<=length) {
                    arr[m++] = nums2[j++];
                }
                break;
            }
            if (j == nums2.length) {
                while (m<=length) {
                    arr[m++] = nums1[i++];
                }
                break;
            }
            if (nums1[i] <= nums2[j]) {
                arr[m++] = nums1[i++];
            }else{
                arr[m++] = nums2[j++];
            }
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (double) (arr[length-1] + arr[length]) / 2;
        }else {
            return arr[length];
        }
    }
}
