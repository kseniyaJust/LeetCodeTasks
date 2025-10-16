package org.example.TasksEasy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSums(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];  // What we need to find
            // If complement exists in map, we found our pair
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Add current number and its index to map
            map.put(array[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }
}
