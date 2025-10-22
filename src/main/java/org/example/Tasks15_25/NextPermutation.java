package org.example.Tasks15_25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int n = nums.length;

        // Step 1: Найти i, где nums[i] < nums[i+1] (идём справа)
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // Если нашли такую позицию
        if (i >= 0) {
            // Step 2: Найти j > i, где nums[j] > nums[i]
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Обмен
            swap(nums, i, j);

        }
        // Step 4: Развернуть подмассив после i
        reverse(nums, i + 1, n - 1);
        System.out.println("Res " + Arrays.toString(nums));

    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }
}
