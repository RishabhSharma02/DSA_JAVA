package com.company;

public class divide_ne {
    public static void main(String[] args) {

    }
    public int divide(int dividend, int divisor) {
        if (Integer.MIN_VALUE == 0 && divisor == -1) {
            return Integer.MIN_VALUE;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0;
        while (a - b >= 0) {
            int x = 0;
            while (a - (b << 1 << x) >= 0) {
                x++;
            }
            res = res + 1 << x;
            a -= b << x;
        }
        if (dividend >= 0 && divisor >= 0) {
            return res;
        }
        else {
            return -1*res;
        }
    }
}
