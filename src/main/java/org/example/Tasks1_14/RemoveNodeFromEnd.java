package org.example.Tasks1_14;

import java.util.List;

public class RemoveNodeFromEnd {
    public static List<Integer> removeNthFromEnd(List<Integer> head, int n) {
        List<Integer> res = new java.util.LinkedList<>(head);
        res.remove(head.size()-n);
        return res;
    }
}
