package org.example.Tasks;

import java.util.LinkedList;
import java.util.List;

public class SumFromList {
    private static int getNumberFromList(List<Integer> l){
        l = l.reversed();
        int digit = l.size()-1;
        int numberFromList =0;
        for(Integer el: l){
            numberFromList += el*Math.pow(10,digit);
            --digit;
        }
        return numberFromList;
    }
    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        int numberFromList1= getNumberFromList(l1);
        int numberFromList2= getNumberFromList(l2);
        List<Integer> result = new LinkedList<>();

        int sum = numberFromList1+numberFromList2;
        while(sum!=0){
            result.add(sum%10);
            sum/=10;
        }

        return result;

    }
}
