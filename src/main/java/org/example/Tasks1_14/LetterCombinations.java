package org.example.Tasks1_14;

import java.util.*;

public class LetterCombinations {
    private final static HashMap<Character,String> numbersWithLetters;

    static{
        numbersWithLetters = new HashMap<>();
        numbersWithLetters.put('2',"abc");
        numbersWithLetters.put('3',"def");
        numbersWithLetters.put('4',"ghi");
        numbersWithLetters.put('5',"jkl");
        numbersWithLetters.put('6',"mno");
        numbersWithLetters.put('7',"pqrs");
        numbersWithLetters.put('8',"tuv");
        numbersWithLetters.put('9',"wxyz");
        numbersWithLetters.put('0'," ");
    }
    public static List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();

        backtrack(digits, 0, new StringBuilder(), res);
        return res;
    }
    private static void backtrack(String digits, int idx, StringBuilder comb, List<String> res) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        String letters = numbersWithLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}
