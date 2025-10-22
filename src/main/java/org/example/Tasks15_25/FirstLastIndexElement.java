package org.example.Tasks15_25;

public class FirstLastIndexElement {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        int left =0, right = nums.length-1;
        while(left<right){
            int middle = left + (right-left)/2;
            if(nums[middle] ==target)
                break;
            if(nums[middle] < target){
                left = middle +1;
            }
            else if(nums[middle] > target){
                right = middle-1;
            }

        }
        for(int i = left;i<right;i++){
            if(nums[i] == target){
                if(res[0] == -1)
                    res[0] = i;
                else
                    res[1] = i;
            }
        }
        return res;
    }
}
