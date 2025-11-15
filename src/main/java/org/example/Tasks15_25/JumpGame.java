package org.example.Tasks15_25;

//Algorithm
//1. Проверка длины массива
//2.
public class JumpGame {
    public static int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int jumps = 0;
        int currentEnd = 0; // указатель на индекс, где достигается максимальный шаг от текущего
        int farthest = 0; //максимальное расстояние (i - количество шагов от начала до текущего индекса, nums[i] - максимальное количество шагов от текущего индекса)

        for (int i = 0; i < n - 1; i++) {
            System.out.println(farthest + " " + (i + nums[i]));

            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }

        return jumps;
    }


}
