package org.example.Tasks1_14;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> makeThreeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        if (nums.length < 3) return List.copyOf(res);
        int sum;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return List.copyOf(res);
    }
}
