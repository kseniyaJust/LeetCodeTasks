package org.example.Tasks;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int result =0;
        char prevLetter = s.charAt(0);
        for(char el: s.toCharArray()){
            if(el==prevLetter){
                result=0;
            }
            result++;
            prevLetter=el;
        }
        return result;
    }
}
