package org.example.Tasks15_25;

public class PowTask {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        int increase = Math.abs(n);
        double res = 1;
        for(int i =0;i<increase;i++){
            res = res * x;
        }
        if(n<0){
            return 1/res;
        }
        else
            return res;
    }
}
