package leetcode.binary_search.median_of_two_sorted_arrays;

public class Runner {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 6, 7, 8};
		int[] arr2 = {11};
		System.out.println(new Solution().findMedianSortedArrays(arr, arr2));;
	}
}
