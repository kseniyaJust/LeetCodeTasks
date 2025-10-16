package org.example.Tasks;

import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int el: height){
            arr.add(el);
        }
        Optional<Integer> maxEl = arr.stream().max(Comparator.comparingInt(Integer::intValue));
        if(maxEl.isEmpty()) return  0;

        int indexOfMax = arr.indexOf(maxEl.get());
        if(indexOfMax == arr.size()-1) return maxEl.get();

        int res = (arr.size()-indexOfMax-1) * arr.getLast(), middleSize =0;
        for(int i = indexOfMax;i<arr.size();i++){
            middleSize =(arr.get(i)-indexOfMax-1) * arr.get(i);
            if(middleSize>res)
                res = middleSize;
        }
        return res;
    }
}
