package leetcode.binary_search.median_of_two_sorted_arrays;

public class Solution {
	//https://leetcode.com/explore/learn/card/binary-search/146/more-practices-ii/1040/
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int left = 0;
		int right = nums1.length;
		int total = nums1.length + nums2.length;
		boolean isEven;
		int median;
		if(total % 2 == 0) {
			median = total / 2;
			isEven = true;
		} else {
			median = (total + 1) / 2;
			isEven = false;
		}
		while(left <= right) {
			int cut1 = left + (right - left) / 2;
			if(cut1 > median) {
				cut1 = median;
			} else if(cut1 < 0) {
				cut1 = 0;
			} else {
				cut1 = cut1;
			}
			int cut2 = median - cut1;
			int cut1Left = (cut1 >= 1 && cut1 <= nums1.length) ? nums1[cut1 - 1] : Integer.MIN_VALUE;
			int cut1Right = (cut1 >= 0 && cut1 < nums1.length) ? nums1[cut1] : Integer.MAX_VALUE;
			int cut2Left = (cut2 >= 1 && cut2 <= nums2.length) ? nums2[cut2 - 1] : Integer.MIN_VALUE;
			int cut2Right = (cut2 >= 0 && cut2 < nums2.length) ? nums2[cut2] : Integer.MAX_VALUE;
			if(cut1Left > cut2Right) {
				right = cut1 - 1;
			} else if(cut2Left > cut1Right) {
				left = cut1 + 1;
			} else {
				if(isEven) {
					return (Math.max(cut1Left, cut2Left) + Math.min(cut1Right, cut2Right)) / 2.0;
				} else {
					return Math.max(cut1Left, cut2Left);
				}
			}
		}
		return 0;
    }
}
