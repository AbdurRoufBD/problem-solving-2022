package leetcode.binary_search.median_of_two_sorted_arrays;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//https://leetcode.com/explore/learn/card/binary-search/146/more-practices-ii/1040/
		int left1 = 0;
		int totalLength = nums1.length + nums2.length;
		int medianIdx = (int) Math.ceil(totalLength/2.0);
		int right1 = medianIdx;
		while(left1 <= right1) {
			int mid1 = left1 + (right1 - left1) / 2;
			int mid2 = medianIdx - mid1 - 1;
			if(mid2 + 1 < nums2.length 
				&& mid1 + 1 < nums1.length
				&& nums1[mid1] <= nums2[mid2 + 1] 
				&& nums1[mid1 + 1] >= nums2[mid2]
			) {
				if(totalLength % 2 == 0) {
					return (Math.min(nums1[mid1], nums2[mid2]) + Math.min(nums1[mid1 + 1], nums2[mid2 + 1])) / 2.0;
				} else {
					return Math.min(nums1[mid1], nums2[mid2]);
				}
			} else if(
					(mid2 + 1 < nums2.length && nums1[mid1] > nums2[mid2 + 1]) 
					|| (mid1 + 1 < nums1.length && nums1[mid1 + 1] > nums2[mid2])
				 ) {
				left1 = mid1 + 1;
			} else {
				right1 = mid1 - 1;
			}
		}
        return 0f;
    }
}
