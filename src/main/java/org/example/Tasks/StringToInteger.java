package org.example.Tasks;

public class StringToInteger {
    public static int myAtoi(String s) {
        int res =0, sign = 1,start =0;
        int oneNumber =0;
        s = s.trim();

        if(s.isEmpty() || s.contains(" ")) return 0;

        if(s.charAt(start) == '-'){
            sign =-1;
            start++;
        }
        else if(s.charAt(start)=='+'){
            start++;
        }
        for(int i =start;i<s.length();i++){
            try{
                oneNumber =Integer.parseInt(s.charAt(i) + "");
                res+= oneNumber* (int)Math.pow(10,s.length()-i-1);

            }catch(NumberFormatException e){
                return res;
            }
        }
        res= res * sign;
        return res;
    }
}
