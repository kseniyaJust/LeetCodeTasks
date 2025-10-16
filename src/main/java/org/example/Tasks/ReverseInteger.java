package org.example.Tasks;

public class ReverseInteger {
    public static int reverseInteger(int number){
        int res = 0, pop =0;
        while(number!=0){
            pop = number%10;
            res = res*10+pop; // за счет умножения на 10 прибавляется еще ноль к числу
            number/=10;
        }
        return res;
    }
}
