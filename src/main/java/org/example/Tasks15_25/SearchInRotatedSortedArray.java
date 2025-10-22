package org.example.Tasks15_25;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left =0,right= nums.length-1;
        while(left<=right){
            int mid = (right+left)/2;
            System.out.println(nums[left] + " " + nums[right]);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
