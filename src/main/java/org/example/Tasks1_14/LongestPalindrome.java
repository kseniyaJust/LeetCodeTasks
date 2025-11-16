package org.example.Tasks1_14;

import java.util.*;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.isBlank()) return "";

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (center at i)
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes (center between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            // Update start and end if we found a longer palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    //выбираем центр и идем от него в две стороны. если буквы не совпали значит стоп
    private static int expandAroundCenter(String s, int left, int right) {
        System.out.println(left + " " + right);
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return length of palindrome
        return right - left - 1;
    }
}
