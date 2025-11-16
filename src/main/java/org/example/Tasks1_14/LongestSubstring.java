package org.example.Tasks1_14;

import java.util.LinkedList;
import java.util.List;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        List<Character> letters = new LinkedList<>();
        int middleResult =0;
        int max =0;
        for(char el: s.toCharArray()){
            if(letters.contains(el)){
                middleResult=0;
            }
            else{
                middleResult++;
                if(middleResult>max)
                    max = middleResult;
                letters.add(el);
            }

        }
        return max;
    }
}
