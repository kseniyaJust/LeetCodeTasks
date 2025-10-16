package org.example.Tasks;

import java.util.HashMap;
import java.util.Stack;

public class IntegerToRoman {
    private static Stack<Integer>  numbersInteger;
    private  static Stack<String> numbersRoman;

    static {
        numbersInteger = new Stack<>();
        numbersRoman = new Stack<>();

        numbersInteger.push(1);
        numbersInteger.push(4);
        numbersInteger.push(5);
        numbersInteger.push(9);
        numbersInteger.push(10);
        numbersInteger.push(40);
        numbersInteger.push(50);
        numbersInteger.push(90);
        numbersInteger.push(100);
        numbersInteger.push(400);
        numbersInteger.push(500);
        numbersInteger.push(900);
        numbersInteger.push(1000);

        numbersRoman.push("I");
        numbersRoman.push("IV");
        numbersRoman.push("V");
        numbersRoman.push("IX");
        numbersRoman.push("X");
        numbersRoman.push("XL");
        numbersRoman.push("L");
        numbersRoman.push("XC");
        numbersRoman.push( "C");
        numbersRoman.push("CD");
        numbersRoman.push("D");
        numbersRoman.push("CM");
        numbersRoman.push("M");

    }
    public static String integerToRoman(int number){
        StringBuilder res = new StringBuilder();
        if(numbersRoman.size() != numbersInteger.size()) return numbersRoman.size() + " " + numbersInteger.size();
        while (!numbersInteger.isEmpty() || number>0){
            if(number>= numbersInteger.peek()){
                res.append(numbersRoman.peek());
                number-= numbersInteger.peek();
            }
            else{
                numbersRoman.pop();
                numbersInteger.pop();
            }


        }
        return res.toString();
    }
}
