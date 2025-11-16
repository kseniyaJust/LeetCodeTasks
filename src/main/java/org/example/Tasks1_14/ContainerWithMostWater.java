package org.example.Tasks1_14;

public class ContainerWithMostWater {
    //height = [1,8,6,2,5,4,8,3,7]
    public static int maxArea(int[] height) {
        int res=0;
        int left =0,right = height.length-1;
        while(left<right){
            res = Math.max(res,(right-left) *Math.min(height[left],height[right]));
            //представь график, нужно вычислить расстояние от одной точки к другой (между right и left) и умножить на высоту минимального
            System.out.println(height[left] + " " + height[right]);
            if(height[left]<height[right])
                left++;
            else
                right--;

        }


        return res;
    }
}
