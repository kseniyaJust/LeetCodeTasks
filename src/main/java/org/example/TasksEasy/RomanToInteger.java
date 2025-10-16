package org.example.TasksEasy;

import java.util.HashMap;

public class RomanToInteger {
    private HashMap<Character,Integer> romanNumbers;
    {
        romanNumbers = new HashMap<>();
        romanNumbers.put('I',1);
        romanNumbers.put('V',5);
        romanNumbers.put('X',10);
        romanNumbers.put('L',50);
        romanNumbers.put('C',100);
        romanNumbers.put('D',500);
        romanNumbers.put('M',1000);

    }
    public int romanToInt(String s){
        int res =0;
        char element = ' ';
        for (int i = 0; i < s.length(); i++) {
            int curr = romanNumbers.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? romanNumbers.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                res -= curr;
            } else {
                res += curr;
            }
        }
//        for(int i =0;i<s.length();i++){
//            element = s.charAt(i);
//            if(!romanNumbers.containsKey(element))
//                break;
//            if(element == 'I' && i!= s.length()-1){
//                if(s.charAt(i+1) =='I')
//                    res++;
//                else
//                    res--;
//            }
//            else
//                res+= romanNumbers.get(element);
//
//        }
        return res;
    }
}
