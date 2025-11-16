package org.example.Tasks1_14;

public class SmallestInteger {
    //Найдите наименьшее неотрицательное целое число, которое не может быть представлено как nums[i] + k * value для любых i и целых k.
    public static int smallestInteger(int[] nums, int value) {
        int[] mp = new int[value];
        for (int x : nums) {
            int v = ((x % value) + value) % value;
            System.out.println(v);
            mp[v]++;
        }
        int mex = 0;
        while (mp[mex % value] > 0) {
            mp[mex % value]--;
            mex++;
        }
        return mex;
    }
}
