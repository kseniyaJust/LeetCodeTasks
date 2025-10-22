package org.example.Tasks15_25;

import java.util.LinkedList;
import java.util.List;

public class Parentheses {
    public static List<String> generateParenthesis(int n) {
        if (n < 1 || n > 8) return List.of("Wrong n");
        List<String> res = new LinkedList<>();

        recursiveFunc(0, 0, "", n, res);
        return res;

    }

    //openP - количество открытых скобок
    //closeP - количество закрытых скобок
    public static void recursiveFunc(int openP, int closeP, String s, int n, List<String> res) {
        if (openP == closeP && openP + closeP == n * 2) {
            res.add(s);
            System.out.println("After " + s);
            return;
        }

        if (openP < n) {
            System.out.println("Open " + openP + " "+ closeP + " " + s);
            recursiveFunc(openP + 1, closeP, s + "(", n, res);
        }
        if (closeP < openP) {
            System.out.println("Close " + openP + " "+ closeP + " " + s);
            recursiveFunc(openP, closeP + 1, s + ")", n, res);
        }
        /*
        *

        if (openP < n) {
            dfs(openP + 1, closeP, s + "(", n, res);
        }

        if (closeP < openP) {
            dfs(openP, closeP + 1, s + ")", n, res);
        }*/
    }
}
