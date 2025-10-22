package org.example.Tasks1_14;

import java.util.*;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        Set<String> palindromeParts= new TreeSet<>();
        StringBuilder res = new StringBuilder();
        int beg =0;
        int step =1;
        while(step != s.length()){
            for(int curr =step;curr<s.length();curr++){
                if(s.charAt(beg) == s.charAt(curr)){
                    int end = curr;
                    for(int i = beg;i<=curr;i++,end--){
                        if(s.charAt(i) != s.charAt(end)){
                            break;
                        }
                        res.append(s.charAt(i));
                    }
                    palindromeParts.add(res.toString());
                    res.delete(0,res.length());
                }
                beg++;
            }
            beg=0;
            step++;
        }
        Optional<String> max = palindromeParts.stream().max(Comparator.comparing(String::length));

        return  max.toString();
    }
}
