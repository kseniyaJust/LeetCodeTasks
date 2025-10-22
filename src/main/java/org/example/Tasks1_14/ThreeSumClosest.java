package org.example.Tasks1_14;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int makeThreeSumClosest(int[] nums, int target) {
        int res =0;
        Arrays.sort(nums);
        int delta= Math.abs(nums[nums.length-1]);
        for(int i =0;i<nums.length-1;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j]+nums[k];
                System.out.println(nums[i] +" " +nums[j]+" "+nums[k]);
                if(sum-target==0){
                    return 0;
                }
                if(Math.abs(sum-target) <delta){
                    delta = Math.abs(sum-target);
                    res = sum;
                    j++;
                }
                else {
                    k--;
                }
            }

        }
        return res;
    }
}
