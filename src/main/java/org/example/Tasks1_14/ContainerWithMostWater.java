package org.example.Tasks1_14;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int res=0;
        int left =0,right = height.length-1;
        while(left<right){
            res = Math.max(res,(right-left) *Math.min(height[left],height[right]));
            System.out.println(height[left] + " " + height[right]);
            if(height[left]<height[right])
                left++;
            else
                right--;

        }


        return res;
    }
}
