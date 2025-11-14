package org.example.Tasks15_25;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumSecond {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        makeCombination(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private static void makeCombination(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res) {
        if(target<0)
            return;
        if (target==0) {
            res.add(new ArrayList<>(comb));
            return;
        }

        for(int i =start;i<candidates.length;i++){
            if(i>start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i]>target)
                break;

            comb.add(candidates[i]);
            makeCombination(candidates,target-candidates[i],i+1,comb,res);
        }

    }
}
