package org.example.Tasks15_25;

import java.util.LinkedList;
import java.util.List;


public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        // Фиктивный узел, чтобы упростить работу с головой
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Пока есть как минимум два узла для обмена
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            // Перестановка: меняем ссылки
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Перемещаем prev на первый узел после обмена (теперь это first)
            prev = first;
        }

        return dummy.next; // новая голова
    }
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Метод для создания списка из массива
    public ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
}

