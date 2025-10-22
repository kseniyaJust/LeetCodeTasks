package org.example.Tasks1_14;

import java.util.*;

public class FourthSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
       Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
       for(int i =0;i<nums.length-1;i++){
           int k = nums.length-i-1;
           int m = i+1;
           int n = k-1;
           while(m<n){
               int sum = nums[i]+nums[k]+nums[m]+nums[n];
               if(sum== target){
                   res.add(List.of(nums[i],nums[m],nums[n],nums[k]));
                   m++;
                   n--;
               }
               else if(sum<target){
                   m++;
               }
               else{
                   n--;
               }
           }


       }
        return List.copyOf(res);
    }
}
