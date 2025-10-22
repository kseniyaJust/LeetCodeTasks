package org.example.Tasks15_25;

import java.util.Arrays;
import java.util.List;

public class MainForSecondPartTasks {
    public static void main(String[] args) {
        //Parenthese Combination
//        System.out.println("Res " + Parentheses.generateParenthesis(2));
        //Divide Integer
//        System.out.println(" Res " + DivideInteger.divide(10,3));
        //FirstLastElement
//        System.out.println("Res " + Arrays.toString(FirstLastIndexElement.searchRange(new int[]{5, 7, 7, 8, 8,8, 10}, 8)));

        //NextPerm
//        NextPermutation.nextPermutation(new int[]{3,2,1});

        //SearchInRotatedArray
//        System.out.println("Res " + SearchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2},0));
        //SwapNodes
        SwapNodes solution = new SwapNodes();
        // Создаём список: 1 -> 2 -> 3 -> 4
        int[] values = {1, 2, 3, 4};
        ListNode head = solution.createList(values);

        System.out.print("Before : ");
        solution.printList(head);

        // Вызов метода swapPairs
        ListNode newHead = solution.swapPairs(head);

        System.out.print("After : ");
        solution.printList(newHead);
    }
}
